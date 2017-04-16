package android.diagnosa.kerusakankomputer.activity.admin;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.GejalaManagementController;
import android.widget.TableLayout;

public class GejalaManagement extends Activity {

	private TableLayout tableGejala;
	private GejalaManagementController gejalaManagementController;

	public TableLayout getTableGejala() {
		return tableGejala;
	}

	protected void onCreate(android.os.Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pakar_gejala);
		
		tableGejala = (TableLayout) findViewById(R.id.table_gejala);
		
		gejalaManagementController = new GejalaManagementController(this);
		gejalaManagementController.fillTableGejala();
		actionListener();
	};

	void actionListener() {

	}
}
