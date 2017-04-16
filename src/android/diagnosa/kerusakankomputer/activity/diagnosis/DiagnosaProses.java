package android.diagnosa.kerusakankomputer.activity.diagnosis;

import android.ai.forwardchaining.example.diagnosakerusakankomputer.R;
import android.app.Activity;
import android.diagnosa.kerusakankomputer.controller.DiagnosaProsesController;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class DiagnosaProses extends Activity {
	private DiagnosaProsesController controller;

	private TextView textPertanyaan;
	private Button btnYes;
	private Button btnNo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diagnosa_proses);

		controller = new DiagnosaProsesController(this);

		btnNo = (Button) findViewById(R.id.btn_diagnosa_tidak);
		btnYes = (Button) findViewById(R.id.btn_diagnosa_ya);
		textPertanyaan = (TextView) findViewById(R.id.text_pertanyaan);
		controller.pertamaMasuk();
		actionListener();
	}

	public void actionListener() {
		getBtnYes().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				controller.btnYes();
			}
		});

		getBtnNo().setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				controller.btnNo();
			}
		});
	}

	public TextView getTextPertanyaan() {
		return textPertanyaan;
	}

	public Button getBtnYes() {
		return btnYes;
	}

	public Button getBtnNo() {
		return btnNo;
	}
}
