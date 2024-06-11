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
    //Observaciones:
    // No hacer array para guardar datos, mas si una collecion -> crear fuera del @test
    //public static Collection<Object[]> data(){}
	
    //El instanciamiento del objecto tiene que ser hecho dientro de la clase main, no del test.
    //La clase test (TelevisoresTest) tiene que contener los atributos expected (para el test), cantidad para el assertEquals y ademas tiene que llamar el contenido de la clase 
    //que el examen dice. Todos estes atributos seran utilizados dentro del test en AssertEquals().
	
}