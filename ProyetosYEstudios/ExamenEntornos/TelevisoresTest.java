import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TelevisoresTest {

	@Test
	void compra(int precioTotal, int cantidad, int precioDiario) {
		ArrayList<Televisores>ListaCompras = new ArrayList<Televisores>();
		Televisores t = new Televisores(precioTotal, cantidad, "Prueba");
		assertEquals(cantidad, Televisores.comprarTelevisores(precioDiario, cantidad, precioTotal));
		
	}
	
}