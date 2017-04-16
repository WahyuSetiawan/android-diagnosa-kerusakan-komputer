package android.diagnosa.kerusakankomputer.connection;

import java.util.List;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R.string;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.diagnosa.kerusakankomputer.connection.configuration.DatabaseConfiguration;
import android.diagnosa.kerusakankomputer.connection.values.ValuesGejala;
import android.diagnosa.kerusakankomputer.connection.values.ValuesKerusakan;
import android.diagnosa.kerusakankomputer.connection.values.ValuesKnowledgeBase;
import android.diagnosa.kerusakankomputer.model.Gejala;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.diagnosa.kerusakankomputer.model.KnowledgeBase;

public abstract class DatabaseHandlerAbstract extends SQLiteOpenHelper
		implements DatabaseConfiguration, ValuesGejala, ValuesKerusakan,
		ValuesKnowledgeBase {
	
	private String[] sqlTableBuilder = {
			"create table " + TABLE_ADMIN + "( " + COLUMN_USERNAME
					+ " varchar (10) primary key, " + COLUMN_PASSWORD
					+ " varchar (10) )",
			"create table " + TABLE_GEJALA + " (" + COLUMN_ID_GEJALA
					+ " varchar(6) primary key, " + COLUMN_KET_GEJALA
					+ " char (255)" + ")",
			"create table " + TABLE_KERUSAKAN + "(" + COLUMN_ID_KERUSAKAN
					+ " varchar (6) primary key, " + COLUMN_KET_KERUSAKAN
					+ " char (50) ," + COLUMN_SARAN_PERBAIKAN + " char (50))",
			"create table " + TABLE_KNOWLEDGE_BASE + " ( "
					+ COLUMN_ID_KNOWLEDGE_BASE + " varchar (6) primary key, "
					+ COLUMN_IF_TRUE + " varchar (6)," + COLUMN_IF_FALSE
					+ " varchar (6)," + COLUMN_GEJALA + " varchar (6),"
					+ COLUMN_KERUSAKAN + " varchar (6))", };

	public DatabaseHandlerAbstract(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		for (String sql : sqlTableBuilder) {
			db.execSQL(sql);
		}

		firstValue(db);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

	private void firstValue(SQLiteDatabase db) {
		db.execSQL("insert into " + TABLE_ADMIN + " values ('admin', 'admin')");
		for (Gejala gejala : valuesGejalas) {
			db.execSQL("insert into " + TABLE_GEJALA + " values ('"
					+ gejala.getId_gejala() + "' , '" + gejala.getKet_gejala()
					+ "')");
		}
		for (Kerusakan kerusakan : kerusakans) {
			db.execSQL("insert into " + TABLE_KERUSAKAN + " values ('"
					+ kerusakan.getId_kerusakan() + "' , '"
					+ kerusakan.getKet_kerusakan() + "' , '"
					+ kerusakan.getSaran_perbaikan() + "')");
		}
		for (KnowledgeBase knowledgeBase : knowledgeBases) {
			db.execSQL("insert into " + TABLE_KNOWLEDGE_BASE + " values ('"
					+ knowledgeBase.getId_knowledge_base() + "' , '"
					+ knowledgeBase.getIf_true() + "' , '"
					+ knowledgeBase.getIf_false() + "' , '"
					+ knowledgeBase.getGejala() + "' , '"
					+ knowledgeBase.getKerusakan() + "')");
		}
	}

}
