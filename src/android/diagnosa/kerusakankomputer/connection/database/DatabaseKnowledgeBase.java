package android.diagnosa.kerusakankomputer.connection.database;

import java.util.ArrayList;
import java.util.List;

import android.R.raw;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.model.KnowledgeBase;

public class DatabaseKnowledgeBase extends DatabaseHandlerAbstract {

	public DatabaseKnowledgeBase(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public List<KnowledgeBase> getAllDataKnowledgeBase() {
		ArrayList<KnowledgeBase> knowledgeBases = new ArrayList<KnowledgeBase>();

		SQLiteDatabase db = getReadableDatabase();

		Cursor cursor = db.rawQuery("select * from " + TABLE_KNOWLEDGE_BASE,
				null);
		if (cursor.moveToFirst()) {
			do {
				knowledgeBases.add(new KnowledgeBase(cursor.getString(0),
						cursor.getString(1), cursor.getString(2), cursor
								.getString(3), cursor.getString(4)));
			} while (cursor.moveToNext());
		}

		return knowledgeBases;
	}

	public KnowledgeBase getDatakKnowledgeBase(String param) {
		SQLiteDatabase db = getReadableDatabase();

		Cursor cursor = db.rawQuery("select * from " + TABLE_KNOWLEDGE_BASE
				+ " where " + COLUMN_ID_KNOWLEDGE_BASE + " = '" + param + "'",
				null);
		
		if (cursor != null) {
			cursor.moveToFirst();
			return new KnowledgeBase(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
		}
		
		return null;
	}

}
