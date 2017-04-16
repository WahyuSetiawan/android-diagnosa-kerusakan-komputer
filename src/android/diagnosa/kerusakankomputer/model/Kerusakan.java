package android.diagnosa.kerusakankomputer.model;

public class Kerusakan {

	private String id_kerusakan;
	private String ket_kerusakan;
	private String saran_perbaikan;

	public String getId_kerusakan() {
		return id_kerusakan;
	}

	public void setId_kerusakan(String id_kerusakan) {
		this.id_kerusakan = id_kerusakan;
	}

	public String getKet_kerusakan() {
		return ket_kerusakan;
	}

	public void setKet_kerusakan(String ket_kerusakan) {
		this.ket_kerusakan = ket_kerusakan;
	}

	public String getSaran_perbaikan() {
		return saran_perbaikan;
	}

	public void setSaran_perbaikan(String saran_perbaikan) {
		this.saran_perbaikan = saran_perbaikan;
	}

	public Kerusakan(String id_kerusakan, String ket_kerusakan,
			String saran_perbaikan) {
		super();
		this.id_kerusakan = id_kerusakan;
		this.ket_kerusakan = ket_kerusakan;
		this.saran_perbaikan = saran_perbaikan;
	}

}
