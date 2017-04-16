package android.diagnosa.kerusakankomputer.connection.database;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.model.Gejala;
import android.diagnosa.kerusakankomputer.model.Kerusakan;

public class DatabaseGejala extends DatabaseHandlerAbstract {

	public DatabaseGejala(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public List<Gejala> getAllGejala() {
		ArrayList<Gejala> gejalas = new ArrayList<Gejala>();

		SQLiteDatabase dbDatabase = getReadableDatabase();
		Cursor cursor = dbDatabase.rawQuery("select * from " + TABLE_GEJALA,
				null);

		if (cursor.moveToFirst()) {
			do {
				gejalas.add(new Gejala(cursor.getString(0), cursor.getString(1)));
			} while (cursor.moveToNext());
		}

		dbDatabase.close();
		return gejalas;
	}

	public Gejala getDataGejala(String param) {
		SQLiteDatabase db = getReadableDatabase();

		Cursor cursor = db.rawQuery("select * from " + TABLE_GEJALA + " where "
				+ COLUMN_ID_GEJALA + " = '" + param + "'", null);

		if (cursor != null) {
			cursor.moveToFirst();
			return new Gejala(cursor.getString(0), cursor.getString(1));
		}

		return null;
	}

}
