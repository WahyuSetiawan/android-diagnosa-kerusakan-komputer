package android.diagnosa.kerusakankomputer.controller;

import java.util.ArrayList;

import android.diagnosa.kerusakankomputer.activity.admin.KerusakanManagement;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKerusakan;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class KerusakanManagementController {
	private KerusakanManagement kerusakanManagement;
	private DatabaseHandlerAbstract database;

	public KerusakanManagementController(
			KerusakanManagement kerusakanManagement) {
		super();
		this.kerusakanManagement = kerusakanManagement;
		this.database = new DatabaseKerusakan(kerusakanManagement);
	}
	
	public void fillTableKerusakan(){
		ArrayList<TableRow> tableRows = new ArrayList<TableRow>();
		
		TextView kerusakan_idTextView = new TextView(kerusakanManagement);
		kerusakan_idTextView.setText("Id kerusakan");
		TextView kerusakan_ketTextView = new TextView(kerusakanManagement);
		kerusakan_ketTextView.setText("Keterangan");
		TextView kerusakan_saranTextView = new TextView(kerusakanManagement);
		kerusakan_saranTextView.setText("Saran");
		TableRow rowTitleRow = new TableRow(kerusakanManagement);
		rowTitleRow.addView(kerusakan_idTextView);
		rowTitleRow.addView(kerusakan_ketTextView);
		rowTitleRow.addView(kerusakan_saranTextView);
		
		tableRows.add(rowTitleRow);
		
		for (Kerusakan kerusakan : ((DatabaseKerusakan) database).getAllDataKerusakan()){
			TextView column1 = new TextView(kerusakanManagement);
			column1.setText(kerusakan.getId_kerusakan());
			TextView column2 = new TextView(kerusakanManagement);
			column2.setText(kerusakan.getKet_kerusakan());
			TextView column3 = new TextView(kerusakanManagement);
			column3.setText(kerusakan.getSaran_perbaikan());
			
			TableRow tableRow = new TableRow(kerusakanManagement);
			tableRow.addView(column1);
			tableRow.addView(column2);
			tableRow.addView(column3);
			
			tableRows.add(tableRow);
		}
		
		for (TableRow tableRow : tableRows) {
			kerusakanManagement.getTableKerusakan().addView(tableRow);
		}
	}

}
