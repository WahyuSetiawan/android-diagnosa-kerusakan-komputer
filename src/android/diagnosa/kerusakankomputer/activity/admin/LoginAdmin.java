package android.diagnosa.kerusakankomputer.activity.admin;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.content.Intent;
import android.diagnosa.kerusakankomputer.controller.LoginAdminController;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginAdmin extends Activity {
	private Button buttonLogin;
	private EditText teksUsername;
	private EditText teksPassword;
	private LoginAdminController loginAdminController;

	public Button getButtonLogin() {
		return buttonLogin;
	}

	public EditText getTeksUsername() {
		return teksUsername;
	}

	public EditText getTeksPassword() {
		return teksPassword;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin_login);

		// dbadmin = new DatabaseHandlerAdmin(this);
		loginAdminController = new LoginAdminController(this);

		buttonLogin = (Button) findViewById(R.id.btn_pakar_login);
		teksUsername = (EditText) findViewById(R.id.btn_login_username);
		teksPassword = (EditText) findViewById(R.id.btn_login_password);

		actionListener();
	}

	private void actionListener() {
		getButtonLogin().setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				loginAdminController.loginAdmin();
			}
		});
	}

}
