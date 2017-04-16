package android.diagnosa.kerusakankomputer.connection.values;

import android.diagnosa.kerusakankomputer.model.Kerusakan;

public interface ValuesKerusakan {
	Kerusakan[] kerusakans = {
			new Kerusakan("KE-001", "Gagal power supply", "Check cable power supply"),
			new Kerusakan("KE-002", "Gagal video proses gagal", "Check cable vga"),
			new Kerusakan("KE-003", "Ram tidak cocok", "Ubah Posisi ram dengan posisi yang tepat"),
			new Kerusakan("KE-004", "Pemasangan cpu dan heatsink tidak pas", "Ubah posisi dengan posisi yang pas"),
			new Kerusakan("KE-005", "Fan error", "Check fan"),
			new Kerusakan("KE-006", "Bootloop screen", "Check motherboard"),
			new Kerusakan("KE-007", "Resolution tidak pas", "Check resolution"),
			new Kerusakan("KE-008", "CMOS tidak default", "Setting CMOS setting default"),
			new Kerusakan("KE-009", "heatsink rusak", "Pasang heatsink yang baru"),
			new Kerusakan("KE-010", "Ram tidak sesuai dengan motherboard", "Ganti dengan ram yang sesuai"),
			new Kerusakan("KE-011", "Setting motherboard gagal", "Balikan settingan awal motherboard"),
			new Kerusakan("KE-012", "Lokasi swap salah", "Check location swap"),
			new Kerusakan("KE-013", "CPU rusak", "Ganti cpu dengan yang baru"),
			new Kerusakan("KE-014", "Motherboard sudah rusak", "Ganti motherboard denngan yang baru"),			
	};

}
