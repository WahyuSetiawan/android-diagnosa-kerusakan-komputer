package android.diagnosa.kerusakankomputer.controller;

import android.content.Intent;
import android.diagnosa.kerusakankomputer.activity.admin.AdminPage;
import android.diagnosa.kerusakankomputer.activity.admin.LoginAdmin;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseAdmin;
import android.sax.StartElementListener;
import android.widget.Toast;

public class LoginAdminController {
	private LoginAdmin loginAdmin;
	private DatabaseHandlerAbstract dbAdmin;

	public LoginAdminController(LoginAdmin loginAdmin) {
		super();
		this.loginAdmin = loginAdmin;
		this.dbAdmin = new DatabaseAdmin(loginAdmin);
	}

	public void loginAdmin() {
		if (loginAdmin.getTeksUsername().toString().equals("")
				|| loginAdmin.getTeksPassword().toString().equals("")) {
			Toast.makeText(loginAdmin, "Field harus diisi", 10).show();
		} else if (loginAdmin
				.getTeksPassword()
				.getText()
				.toString()
				.equals(((DatabaseAdmin) dbAdmin)
						.getAdmin(
								loginAdmin.getTeksUsername().getText()
										.toString()).getPasswordString()
						.toString())) {
			Toast.makeText(loginAdmin, "Sukses", 10).show();
			loginAdmin.startActivity(new Intent(loginAdmin, AdminPage.class));
			loginAdmin.finish();
		} else {
			Toast.makeText(loginAdmin, "Password masih salah", 10).show();
		}
	}

}
