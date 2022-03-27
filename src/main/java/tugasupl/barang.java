package tugasupl;

public class barang {
	private String id;
	private String namaBarang;
	private String kodeDiskon;
	
	public barang(String id, String namaBarang, String kodeDiskon) {
		this.id = id;
		this.namaBarang = namaBarang;
		this.kodeDiskon = kodeDiskon;
	}
	
	public String getId() {
		return id;
	}
	
	public String getNamaBarang() {
		return namaBarang;
	}
	
	public String getKodeDiskon() {
		return kodeDiskon;
	}
	
	public int getDiskon(diskon diskon) {
		return diskon.diskonBarang();
	}
}
