package android.diagnosa.kerusakankomputer.activity.admin;

import java.util.zip.Inflater;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.AdminPageController;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminPage extends Activity {
	private ImageButton btnDaftarKerusakan;
	private ImageButton btnDaftarGejala;
	private ImageButton btnPeraturanAdmin;
	private ImageButton btnRelasiPakar;
	private AdminPageController adminPageController;

	public ImageButton getBtnDaftarKerusakan() {
		return btnDaftarKerusakan;
	}

	public ImageButton getBtnDaftarGejala() {
		return btnDaftarGejala;
	}

	public ImageButton getBtnPeraturanAdmin() {
		return btnPeraturanAdmin;
	}

	public ImageButton getBtnRelasiPakar() {
		return btnRelasiPakar;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin_page);

		adminPageController = new AdminPageController(this);

		btnDaftarGejala = (ImageButton) findViewById(R.id.menu_pakar_daftar_gejala);
		btnDaftarKerusakan = (ImageButton) findViewById(R.id.menu_pakar_daftar_kerusakan);
		btnPeraturanAdmin = (ImageButton) findViewById(R.id.menu_pakar_peraturan_admin);
		btnRelasiPakar = (ImageButton) findViewById(R.id.menu_pakar_kerusakan);

		actionListener();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		return super.onCreateOptionsMenu(menu);
	}

	private void actionListener() {
		getBtnDaftarGejala().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adminPageController.clickDaftarGejala();
			}
		});

		getBtnDaftarKerusakan().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adminPageController.clickDaftarKerusakan();
			}
		});

		getBtnPeraturanAdmin().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adminPageController.clickDaftarAdmin();
			}
		});

		getBtnRelasiPakar().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adminPageController.clickDaftarRelasiPakar();
			}
		});
	}
}
