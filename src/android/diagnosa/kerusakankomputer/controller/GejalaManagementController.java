package android.diagnosa.kerusakankomputer.controller;

import java.util.ArrayList;
import java.util.Iterator;

import android.diagnosa.kerusakankomputer.activity.admin.GejalaManagement;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseGejala;
import android.diagnosa.kerusakankomputer.model.Gejala;
import android.widget.TableRow;
import android.widget.TextView;

public class GejalaManagementController {

	private GejalaManagement gejalaManagement;
	private DatabaseHandlerAbstract databaseGejala;

	public GejalaManagementController(GejalaManagement gejalaManagement) {
		super();
		this.gejalaManagement = gejalaManagement;
		databaseGejala = new DatabaseGejala(gejalaManagement);
	}

	public void fillTableGejala() {
		ArrayList<TableRow> tableRows = new ArrayList<TableRow>();

		TextView viewIDgejala = new TextView(gejalaManagement);
		viewIDgejala.setText("ID GEJALA");

		TextView viewKetGejalaTextView = new TextView(gejalaManagement);
		viewKetGejalaTextView.setText("KETERANGAN GEJALA");

		TableRow rowTitle = new TableRow(gejalaManagement);
		rowTitle.addView(viewIDgejala);
		rowTitle.addView(viewKetGejalaTextView);

		tableRows.add(rowTitle);
		
		for (Gejala gejala : ((DatabaseGejala) databaseGejala).getAllGejala()) {
			TextView column_id_gejala = new TextView(gejalaManagement);
			column_id_gejala.setText(gejala.getId_gejala());
			TextView column_ket_gejala = new TextView(gejalaManagement);
			column_ket_gejala.setText(gejala.getKet_gejala());
			TableRow tableRow = new TableRow(gejalaManagement);
			tableRow.addView(column_id_gejala);
			tableRow.addView(column_ket_gejala);
			tableRows.add(tableRow);
		}

		for (TableRow tableRow : tableRows) {
			gejalaManagement.getTableGejala().addView(tableRow);
		}
	}
}
