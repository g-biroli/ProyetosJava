package extraordinaria;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import extraordinaria.Parte1.ComprarAuto;	//test proyecto prueba
											
	public class Parte1Test {       //junit test
	double expected;
	int cantidad;
	ComprarAuto compraAuto;
		
	
	public Parte1Test(double expected, int cantidad, ComprarAuto compraAuto) {
		this.expected = expected;
		this.cantidad = cantidad;
		this.compraAuto = new ComprarAuto("Coche", 100, 20);
	}

	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{"Coche 1", 10000, 10, 5, 450.0},
				{"Coche 2", 2000, 20, 3, 480.0}
		});
	}	
	
	@Test
	void testCompraAuto() {						
		assertEquals(expected, compraAuto.compraAuto(cantidad), 0.01);
	}

	
	
}