package tugasupl;

public class diskon {
	int diskon;
	barang barang;
	
	public diskon(barang barang) {
		this.barang = barang;
	}
	
	public int diskonBarang() {
		String getDiskon = barang.getKodeDiskon();
		
		if (getDiskon == "A") {
			diskon = 20000;
		}else if(getDiskon == "B"){
			diskon = 15000;
		}
		return diskon;
	}
}