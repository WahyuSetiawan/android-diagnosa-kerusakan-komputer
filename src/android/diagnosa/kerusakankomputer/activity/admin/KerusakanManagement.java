package android.diagnosa.kerusakankomputer.activity.admin;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.KerusakanManagementController;
import android.os.Bundle;
import android.widget.TableLayout;

public class KerusakanManagement extends Activity {
	private TableLayout tableKerusakan;
	private KerusakanManagementController KerusakanManagementController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pakar_kerusakan);
		KerusakanManagementController = new KerusakanManagementController(this);
		tableKerusakan = (TableLayout) findViewById(R.id.table_kerusakan);
		actionListener();
		KerusakanManagementController.fillTableKerusakan();
	}
	
	public TableLayout getTableKerusakan() {
		return tableKerusakan;
	}

	public void actionListener(){
		
	}
}
