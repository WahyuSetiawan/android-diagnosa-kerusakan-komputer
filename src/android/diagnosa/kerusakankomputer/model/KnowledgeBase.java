package android.diagnosa.kerusakankomputer.model;

public class KnowledgeBase {

	private String id_knowledge_base;
	private String if_true;
	private String if_false;
	private String gejala;
	private String kerusakan;

	public String getId_knowledge_base() {
		return id_knowledge_base;
	}

	public void setId_knowledge_base(String id_knowledge_base) {
		this.id_knowledge_base = id_knowledge_base;
	}

	public String getIf_true() {
		return if_true;
	}

	public void setIf_true(String if_true) {
		this.if_true = if_true;
	}

	public String getIf_false() {
		return if_false;
	}

	public void setIf_false(String if_false) {
		this.if_false = if_false;
	}

	public String getGejala() {
		return gejala;
	}

	public void setGejala(String gejala) {
		this.gejala = gejala;
	}

	public String getKerusakan() {
		return kerusakan;
	}

	public void setKerusakan(String kerusakan) {
		this.kerusakan = kerusakan;
	}

	public KnowledgeBase(String id_knowledge_base, String if_true,
			String if_false, String gejala, String kerusakan) {
		super();
		this.id_knowledge_base = id_knowledge_base;
		this.if_true = if_true;
		this.if_false = if_false;
		this.gejala = gejala;
		this.kerusakan = kerusakan;
	}

}
