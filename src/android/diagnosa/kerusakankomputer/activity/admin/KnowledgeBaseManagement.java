package android.diagnosa.kerusakankomputer.activity.admin;

import android.support.v7.app.ActionBarActivity;
import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.ai.forwardchaining.example.diagnosakerusakankomputer.R.id;
import android.ai.forwardchaining.example.diagnosakerusakankomputer.R.layout;
import android.ai.forwardchaining.example.diagnosakerusakankomputer.R.menu;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.KnowledgeBaseManagementController;
import android.net.wifi.p2p.WifiP2pManager.ActionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

public class KnowledgeBaseManagement extends Activity {
private TableLayout tableLayout;
private KnowledgeBaseManagementController controrller;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pakar_knowledgebase);
		
		controrller = new KnowledgeBaseManagementController(this);
		tableLayout = (TableLayout) findViewById(R.id.tableKnowledgeBase);
		
		actionListener();
		controrller.fillTable();
	}

	public TableLayout getTableLayout() {
		return tableLayout;
	}
	
	public void actionListener(){
		
	}
}
