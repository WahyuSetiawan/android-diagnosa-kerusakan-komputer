package android.diagnosa.kerusakankomputer.controller;

import java.util.ArrayList;
import java.util.List;

import android.R.array;
import android.diagnosa.kerusakankomputer.activity.admin.AdminManagement;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseAdmin;
import android.diagnosa.kerusakankomputer.model.Admin;
import android.graphics.drawable.GradientDrawable;
import android.sax.StartElementListener;
import android.view.Gravity;
import android.widget.TableRow;
import android.widget.TextView;

public class AdminManagementController {
	private AdminManagement adminManagement;
	private DatabaseHandlerAbstract dbadAdmin;

	public AdminManagementController(AdminManagement adminManagement) {
		super();
		this.adminManagement = adminManagement;
		dbadAdmin = new DatabaseAdmin(adminManagement);
	}
	
	public void FillTableRow() {
		ArrayList<TableRow> tableRows = new ArrayList<TableRow>();
		TableRow tableTitleRow = new TableRow(adminManagement);
		
		tableTitleRow.setGravity(Gravity.CENTER_HORIZONTAL);
		
		TextView textView = new TextView(adminManagement);
		textView.setText("Username");
		tableTitleRow.addView(textView);
		
		TextView textView1 = new TextView(adminManagement);
		textView1.setText("Password");
		tableTitleRow.addView(textView1);
		
		tableRows.add(tableTitleRow);
		
		for (Admin admin : ((DatabaseAdmin) dbadAdmin).getAllAdmin()){
			TableRow tableTitleRow1 = new TableRow(adminManagement);
			
			tableTitleRow1.setGravity(Gravity.CENTER_HORIZONTAL);
			
			TextView textView2 = new TextView(adminManagement);
			textView2.setText(admin.getUsernameString());
			textView2.setGravity(Gravity.CENTER);
			tableTitleRow1.addView(textView2);
			
			TextView textView3 = new TextView(adminManagement);
			textView3.setGravity(Gravity.CENTER);
			textView3.setText(admin.getPasswordString());
			tableTitleRow1.addView(textView3);
			
			tableRows.add(tableTitleRow1);
		}
		
		
		
		for (TableRow tableRow : tableRows) {
			adminManagement.getTableAdmin().addView(tableRow);
		}
	}
	private void menuItemTambah() {
		// TODO Auto-generated method stub
	}

}
