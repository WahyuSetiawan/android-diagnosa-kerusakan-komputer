package android.diagnosa.kerusakankomputer.activity.admin;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.ai.forwardchaining.example.diagnosakerusakankomputer.R.menu;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.AdminManagementController;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

public class AdminManagement extends Activity {
	private TableLayout tableAdmin;
	private AdminManagementController adminManagementController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.pakar_admin);
		
		adminManagementController = new AdminManagementController(this);

		tableAdmin = (TableLayout) findViewById(R.id.table_admin);
		
		adminManagementController.FillTableRow();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.admin, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.menu_id_tambah:
			
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	public TableLayout getTableAdmin() {
		return tableAdmin;
	}
}
