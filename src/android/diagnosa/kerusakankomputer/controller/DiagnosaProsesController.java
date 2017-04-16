package android.diagnosa.kerusakankomputer.controller;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.diagnosa.kerusakankomputer.activity.diagnosis.DiagnosaProses;
import android.diagnosa.kerusakankomputer.activity.diagnosis.HasilProses;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseGejala;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKerusakan;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKnowledgeBase;
import android.diagnosa.kerusakankomputer.model.Gejala;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.diagnosa.kerusakankomputer.model.KnowledgeBase;
import android.widget.Toast;

public class DiagnosaProsesController {
	private List<String> tempList = new ArrayList<String>();
	private KnowledgeBase knowledgeBasecurrent;
	private DiagnosaProses diagnosaProses;
	private DatabaseHandlerAbstract databaseKB;
	private DatabaseHandlerAbstract databaseGejala;
	private DatabaseHandlerAbstract databaseKerusakan;

	public DiagnosaProsesController(DiagnosaProses diagnosaProses) {
		super();
		this.diagnosaProses = diagnosaProses;
		this.databaseKB = new DatabaseKnowledgeBase(diagnosaProses);
		this.databaseGejala = new DatabaseGejala(diagnosaProses);
		this.databaseKerusakan = new DatabaseKerusakan(diagnosaProses);
	}

	public void pertamaMasuk() {
			List<KnowledgeBase> tempBases = ((DatabaseKnowledgeBase) databaseKB)
					.getAllDataKnowledgeBase();
			Gejala gejala = ((DatabaseGejala) databaseGejala)
					.getDataGejala(tempBases.get(0).getGejala());
			diagnosaProses.getTextPertanyaan().setText(gejala.getKet_gejala());
			knowledgeBasecurrent = tempBases.get(0);
		
	}

	public void btnYes() {
		// receive data
		if (knowledgeBasecurrent.getIf_true().substring(0, 2).equals("PE")) {
			knowledgeBasecurrent = ((DatabaseKnowledgeBase) databaseKB).getDatakKnowledgeBase(knowledgeBasecurrent.getIf_true());
		} else {
			KnowledgeBase knowledgeBase = ((DatabaseKnowledgeBase) databaseKB).getDatakKnowledgeBase(knowledgeBasecurrent.getIf_true());
			Kerusakan kerusakan = ((DatabaseKerusakan) databaseKerusakan).getDataKerusakan(knowledgeBase.getKerusakan());
			diagnosaProses.startActivity(new Intent(diagnosaProses, HasilProses.class).putExtra("idKerusakan", kerusakan.getId_kerusakan()));
			diagnosaProses.finish();
		}
		// proses data
		Gejala gejala = ((DatabaseGejala) databaseGejala).getDataGejala(knowledgeBasecurrent.getGejala());
		// render view
		diagnosaProses.getTextPertanyaan().setText(gejala.getKet_gejala());
	}

	public void btnNo() {
		if (knowledgeBasecurrent.getIf_false().substring(0, 2).equals("PE")) {
			knowledgeBasecurrent = ((DatabaseKnowledgeBase) databaseKB).getDatakKnowledgeBase(knowledgeBasecurrent.getIf_false());
		} else {
			KnowledgeBase knowledgeBase = ((DatabaseKnowledgeBase) databaseKB).getDatakKnowledgeBase(knowledgeBasecurrent.getIf_false());
			Kerusakan kerusakan = ((DatabaseKerusakan) databaseKerusakan).getDataKerusakan(knowledgeBase.getKerusakan());
			diagnosaProses.startActivity(new Intent(diagnosaProses, HasilProses.class).putExtra("idKerusakan", kerusakan.getId_kerusakan()));
			diagnosaProses.finish();
		}
		// proses data
		Gejala gejala = ((DatabaseGejala) databaseGejala).getDataGejala(knowledgeBasecurrent.getGejala());
		// render view
		diagnosaProses.getTextPertanyaan().setText(gejala.getKet_gejala());
	}

}
