package android.diagnosa.kerusakankomputer.connection.database;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.model.Admin;
import android.util.Log;

public class DatabaseAdmin extends DatabaseHandlerAbstract{

	
	public DatabaseAdmin(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public void addAdmin(Admin admin) {
		SQLiteDatabase db = getWritableDatabase();
		
		ContentValues contentValues = new ContentValues();
		
		contentValues.put(COLUMN_USERNAME, admin.getUsernameString());
		contentValues.put(COLUMN_PASSWORD, admin.getPasswordString());

		db.insert(TABLE_ADMIN, null, contentValues);
		db.close();
	}
	
	public Admin getAdmin(String usernameString){
		SQLiteDatabase db = getReadableDatabase();
		
		Cursor cursor = db.query(TABLE_ADMIN, new String [] {COLUMN_USERNAME,COLUMN_PASSWORD}, COLUMN_USERNAME + " = '" + usernameString + "'", null, null, null, null);
		//Cursor cursor = db.rawQuery("select * from " + TABLE_ADMIN + " where "+ COLUMN_USERNAME + " = '" +usernameString + "'", null);
		Log.d("", String.valueOf(cursor.getCount()));
		if (cursor.moveToFirst()) {
			db.close();
			return new Admin(cursor.getString(0), cursor.getString(1));
		}
		db.close();
		return null;
		
		
	}
	
	public List<Admin> getAllAdmin(){
		ArrayList<Admin> admins = new ArrayList<Admin>();
		
		SQLiteDatabase dbDatabase = getReadableDatabase();
		
		Cursor cursor = dbDatabase.rawQuery("select * from " + TABLE_ADMIN, null);
		
		if(cursor.moveToFirst()){
			do {
				admins.add(new Admin(cursor.getString(0), cursor.getString(1)));		
			}while  (cursor.moveToNext());
		}
		
		
		return admins;
	}

}
