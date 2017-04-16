package android.diagnosa.kerusakankomputer.activity.diagnosis;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.HasilProsesController;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class HasilProses extends Activity {
	private HasilProsesController hasilProsesController;
	private TextView txtKeteranganKerusakan;
	private TextView txtSaranKerusakan;
	private Button btnKembali;
	private String idKerusakan;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_hasil);
		
		idKerusakan = getIntent().getStringExtra("idKerusakan");

		hasilProsesController = new HasilProsesController(this);
		btnKembali = (Button) findViewById(R.id.diagnosis_hasil_button_kembali);
		txtKeteranganKerusakan = (TextView) findViewById(R.id.diagnosis_hasil_text_keterangan_kerusakan);
		txtSaranKerusakan = (TextView) findViewById(R.id.diagnesis_hasil_text_saran_perbaikan);
		hasilProsesController.renderView();
		
		actionListener();
	}

	public String getIdKerusakan() {
		return idKerusakan;
	}

	private void actionListener() {
		getBtnKembali().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				hasilProsesController.btnKembali();
			}
		});
	}

	public TextView getTxtKeteranganKerusakan() {
		return txtKeteranganKerusakan;
	}

	public TextView getTxtSaranKerusakan() {
		return txtSaranKerusakan;
	}

	public Button getBtnKembali() {
		return btnKembali;
	}
}
