package android.diagnosa.kerusakankomputer.activity;

import java.nio.Buffer;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.diagnosa.kerusakankomputer.activity.admin.AdminPage;
import android.diagnosa.kerusakankomputer.activity.admin.LoginAdmin;
import android.diagnosa.kerusakankomputer.activity.diagnosis.DiagnosaProses;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MenuUtama extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		
		Button btnDiagnosaButton = (Button) findViewById(R.id.button_mainmenu_diagnosa);
		
		btnDiagnosaButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				startActivity(new Intent(MenuUtama.this, DiagnosaProses.class));
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.action_mainmenu, menu);
		return super.onCreateOptionsMenu(menu);		
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_mainmenu_admin:
			startActivity(new Intent(this, LoginAdmin.class ));
			//startActivity(new Intent(this, AdminPage.class ));
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}

}
