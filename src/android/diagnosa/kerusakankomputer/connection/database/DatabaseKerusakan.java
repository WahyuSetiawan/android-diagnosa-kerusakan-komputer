package android.diagnosa.kerusakankomputer.connection.database;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.diagnosa.kerusakankomputer.model.KnowledgeBase;

public class DatabaseKerusakan extends DatabaseHandlerAbstract {

	public DatabaseKerusakan(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public List<Kerusakan> getAllDataKerusakan() {
		ArrayList<Kerusakan> kerusakans = new ArrayList<Kerusakan>();

		SQLiteDatabase db = getReadableDatabase();

		Cursor cursor = db.rawQuery("select * from " + TABLE_KERUSAKAN, null);

		if (cursor.moveToFirst()) {
			do {
				kerusakans.add(new Kerusakan(cursor.getString(0), cursor
						.getString(1), cursor.getString(2)));
			} while (cursor.moveToNext());
		}
		
		return kerusakans;
	}
	
	public Kerusakan getDataKerusakan(String param){
		SQLiteDatabase db = getReadableDatabase();

		Cursor cursor = db.rawQuery("select * from " + TABLE_KERUSAKAN
				+ " where " + COLUMN_ID_KERUSAKAN + " = '" + param + "'",
				null);
		
		if (cursor != null) {
			cursor.moveToFirst();
			return new Kerusakan(cursor.getString(0), cursor.getString(1), cursor.getString(2));
		}
		
		return null;
	}

}
