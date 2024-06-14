package correcao;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import correcao.parte1.ComprarTelevisores;

	public class ComprarTelevisoresTest {
		ComprarTelevisores comprarTelevisor;
		int cantidad;
		double expected;
		
		
	public ComprarTelevisoresTest(String televisor, int precioDiarioMes, int descuento, int cantidad, double expected) {
			this.comprarTelevisor = new ComprarTelevisores(televisor, precioDiarioMes, descuento);
			this.cantidad = cantidad;
			this.expected = expected;
		}
	
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{"Televisor A", 100, 10, 5, 450.0},
			{"Televisor B", 200, 20, 3, 480.0},
			{"Televisor C", 150, 15, 4, 510.0}
		});
	}
	@Test
	void testComprarTelevisores() {
		assertEquals(expected, comprarTelevisor.comprarTelevisor(cantidad), 0.01);
	}

}
