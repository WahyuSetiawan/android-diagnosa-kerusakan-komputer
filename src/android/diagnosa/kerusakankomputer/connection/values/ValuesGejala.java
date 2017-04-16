package android.diagnosa.kerusakankomputer.connection.values;

import android.diagnosa.kerusakankomputer.model.Gejala;

public interface ValuesGejala {

	public Gejala[] valuesGejalas = {
			new Gejala("GE-001", "Apakah layar menyala ?"),
			new Gejala("GE-002", "Apakah power diagnosa selesai ?"),
			new Gejala("GE-003", "Apakah video diagnosa selesai ?"),
			new Gejala("GE-004", "Apakah ram sesuai ?"),
			new Gejala("GE-005", "Apakah penempatan cpu sesuai ?"),
			new Gejala("GE-006", "Apakah kipas cpu berputar ?"),
			new Gejala("GE-007", "Apakah terdengar nada beep ?"),
			new Gejala("GE-008", "Apakah setting default bios ?"),
			new Gejala("GE-009", "Apakah jalankah pengecekan hardware ?"),
			new Gejala("GE-010", "Apakah cpu swap jalan ?"),
			new Gejala("GE-011", "Apakah frezzes on boot screen ?"),
			new Gejala("GE-012", "Apakah frezzes ?"),
			new Gejala("GE-013", "Apakah frezzes swap ram ?"),
			new Gejala("GE-014", "Apakah cmos default ?"),
			new Gejala("GE-015", "Apakah heatsink hidup ?") };
}
