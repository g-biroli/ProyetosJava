package aula12;

public class Aula12 {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Cobra c = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Canguru ca = new Canguru();
		Cachorro cc = new Cachorro();
		Arara ar = new Arara();
		
		m.setPeso(20);
		m.setCorPelo("Branco");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		ca.locomover();
		cc.emitirSom();
		
		
		//Polimorfismo é o mesmo método, subscrito em diversas classes que resultam em diversas respostas.
	}

}