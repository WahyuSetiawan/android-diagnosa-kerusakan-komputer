package android.diagnosa.kerusakankomputer.controller;

import android.content.Intent;
import android.diagnosa.kerusakankomputer.activity.MenuUtama;
import android.diagnosa.kerusakankomputer.activity.diagnosis.HasilProses;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKerusakan;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKnowledgeBase;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.widget.Toast;

public class HasilProsesController {

	private HasilProses hasilProses;
	private DatabaseHandlerAbstract databaseHandlerAbstract;

	public HasilProsesController(HasilProses hasilProses) {
		super();
		this.hasilProses = hasilProses;
		this.databaseHandlerAbstract = new DatabaseKerusakan(hasilProses);
	}

	public void renderView() {
		Kerusakan kerusakan = ((DatabaseKerusakan) databaseHandlerAbstract)
				.getDataKerusakan(hasilProses.getIdKerusakan());

		hasilProses.getTxtKeteranganKerusakan().setText(
				"Kerusakan : " + kerusakan.getKet_kerusakan());
		hasilProses.getTxtSaranKerusakan().setText(
				"Saran : " + kerusakan.getSaran_perbaikan());
	}

	public void btnKembali() {
		Toast.makeText(hasilProses, "keluar", 10).show();
		;
		hasilProses.startActivity(new Intent(hasilProses, MenuUtama.class));
		hasilProses.finish();
	}

}
