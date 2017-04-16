package android.diagnosa.kerusakankomputer.controller;

import android.content.Intent;
import android.diagnosa.kerusakankomputer.activity.admin.AdminManagement;
import android.diagnosa.kerusakankomputer.activity.admin.AdminPage;
import android.diagnosa.kerusakankomputer.activity.admin.GejalaManagement;
import android.diagnosa.kerusakankomputer.activity.admin.KerusakanManagement;
import android.diagnosa.kerusakankomputer.activity.admin.KnowledgeBaseManagement;

public class AdminPageController {
	private AdminPage adminPage;

	public AdminPageController(AdminPage adminPage) {
		super();
		this.adminPage = adminPage;
	}

	public void clickDaftarKerusakan() {
		adminPage
				.startActivity(new Intent(adminPage, KerusakanManagement.class));
	}

	public void clickDaftarGejala() {
		adminPage.startActivity(new Intent(adminPage, GejalaManagement.class));
	}

	public void clickDaftarRelasiPakar() {
		adminPage.startActivity(new Intent(adminPage,
				KnowledgeBaseManagement.class));
	}

	public void clickDaftarAdmin() {
		adminPage.startActivity(new Intent(adminPage, AdminManagement.class));
	}
}
