package aula13;

public class Principal {

	public static void main(String[] args) {
		
		Lobo l = new Lobo();
		Cachorro c = new Cachorro();
		l.emitirSom();
		c.emitirSom();
		
		c.reagir("Toma comida");
		c.reagir(false);
		c.reagir(true);
	}

}
