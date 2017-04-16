package android.diagnosa.kerusakankomputer.connection.configuration;

public interface DatabaseConfiguration {
	public static int DATABASE_VERSION = 2;

	public static String DATABASE_NAME = "diagnosakerusakankomputer";

	public static String TABLE_ADMIN = "admin";
	public static String COLUMN_USERNAME = "username";
	public static String COLUMN_PASSWORD = "password";

	public static String TABLE_KERUSAKAN = "kerusakan";
	public static String COLUMN_ID_KERUSAKAN = "id_kerusakan";
	public static String COLUMN_KET_KERUSAKAN = "ket_kerusakan";
	public static String COLUMN_SARAN_PERBAIKAN = "saran_perbaikan";

	public static String TABLE_GEJALA = "gejala";
	public static String COLUMN_ID_GEJALA = "id_gejala";
	public static String COLUMN_KET_GEJALA = "ket_gejala";

	public static String TABLE_KNOWLEDGE_BASE = "knowledge_base";
	public static String COLUMN_ID_KNOWLEDGE_BASE = "id_knownledge_base";
	public static String COLUMN_IF_TRUE = "true";
	public static String COLUMN_IF_FALSE = "false";
	public static String COLUMN_GEJALA = "id_gejala";
	public static String COLUMN_KERUSAKAN = "id_kerusakan";
}
