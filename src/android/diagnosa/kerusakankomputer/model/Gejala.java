package android.diagnosa.kerusakankomputer.model;

public class Gejala {
	private String id_gejala;
	private String ket_gejala;

	public String getId_gejala() {
		return id_gejala;
	}

	public void setId_gejala(String id_gejala) {
		this.id_gejala = id_gejala;
	}

	public String getKet_gejala() {
		return ket_gejala;
	}

	public void setKet_gejala(String ket_gejala) {
		this.ket_gejala = ket_gejala;
	}

	public Gejala(String id_gejala, String ket_gejala) {
		super();
		this.id_gejala = id_gejala;
		this.ket_gejala = ket_gejala;
	}

}
