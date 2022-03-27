package tugasupl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class barangTest {

	private barang barang;
	
	@BeforeEach
	public void setBarangDiAwal() {
		barang = new barang("QW2123", "Baju", "A");
	}
	
	//using mock object
	@Test
	@DisplayName("Get nominal diskon berdasarkan kode diskon")
	public void testGetDiskon() {
		diskon diskon = mock(diskon.class);
		when(diskon.diskonBarang()).thenReturn(20000);
		
		assertEquals(20000, barang.getDiskon(diskon));
	}
	
	@Test
	@DisplayName("Get Id barang")
	public void testGetId() {
		assertEquals("QW2123", barang.getId());
	}
	
	@Test
	@DisplayName("Get nama barang")
	public void testGetNamaBarang() {
		assertEquals("Baju", barang.getNamaBarang());
	}
	
	@Test
	@DisplayName("Get kode diskon")
	public void testGetKodeDiskon() {
		assertEquals("A", barang.getKodeDiskon());
	}
}
