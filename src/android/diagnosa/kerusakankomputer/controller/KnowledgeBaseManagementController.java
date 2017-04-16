package android.diagnosa.kerusakankomputer.controller;

import java.util.ArrayList;

import android.diagnosa.kerusakankomputer.activity.admin.KnowledgeBaseManagement;
import android.diagnosa.kerusakankomputer.connection.DatabaseHandlerAbstract;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKerusakan;
import android.diagnosa.kerusakankomputer.connection.database.DatabaseKnowledgeBase;
import android.diagnosa.kerusakankomputer.model.Kerusakan;
import android.diagnosa.kerusakankomputer.model.KnowledgeBase;
import android.widget.TableRow;
import android.widget.TextView;

public class KnowledgeBaseManagementController {
private KnowledgeBaseManagement BaseManagement;
private DatabaseHandlerAbstract databaseHandlerAbstract;
public KnowledgeBaseManagementController(KnowledgeBaseManagement baseManagement) {
	super();
	BaseManagement = baseManagement;
	this.databaseHandlerAbstract = new DatabaseKnowledgeBase(baseManagement);
}


public void fillTable() {
	ArrayList<TableRow> tableRows = new ArrayList<TableRow>();
	
	TextView knowledgebase_idTextView = new TextView(BaseManagement);
	knowledgebase_idTextView.setText("Id knowledgebase");
	TextView knowledgebase_benarTextView = new TextView(BaseManagement);
	knowledgebase_benarTextView.setText("benar");
	TextView knowledgebase_salahTextView = new TextView(BaseManagement);
	knowledgebase_salahTextView.setText("Salah");
	TextView knowledgebase_id_kerusakan = new TextView(BaseManagement);
	knowledgebase_id_kerusakan.setText("id_kerusakan");
	TextView knowledgebase_id_gejala = new TextView(BaseManagement);
	knowledgebase_id_gejala.setText("id_gejala");
	TableRow rowTitleRow = new TableRow(BaseManagement);
	rowTitleRow.addView(knowledgebase_idTextView);
	rowTitleRow.addView(knowledgebase_benarTextView);
	rowTitleRow.addView(knowledgebase_salahTextView);
	rowTitleRow.addView(knowledgebase_id_gejala);
	rowTitleRow.addView(knowledgebase_id_kerusakan);
	
	tableRows.add(rowTitleRow);
	
	for (KnowledgeBase knowledgeBase : ((DatabaseKnowledgeBase) databaseHandlerAbstract).getAllDataKnowledgeBase()){
		TextView column1 = new TextView(BaseManagement);
		column1.setText(knowledgeBase.getId_knowledge_base());
		TextView column2 = new TextView(BaseManagement);
		column2.setText(knowledgeBase.getIf_true());
		TextView column3 = new TextView(BaseManagement);
		column3.setText(knowledgeBase.getIf_false());
		TextView column4 = new TextView(BaseManagement);
		column4.setText(knowledgeBase.getGejala());
		TextView column5 = new TextView(BaseManagement);
		column5.setText(knowledgeBase.getKerusakan());
		
		TableRow tableRow = new TableRow(BaseManagement);
		tableRow.addView(column1);
		tableRow.addView(column2);
		tableRow.addView(column3);
		tableRow.addView(column4);
		tableRow.addView(column5);
		
		tableRows.add(tableRow);
	}
	
	for (TableRow tableRow : tableRows) {
		BaseManagement.getTableLayout().addView(tableRow);
	}
}
}
