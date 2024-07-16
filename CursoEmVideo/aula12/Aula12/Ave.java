package aula12;

public class Ave extends Animal {
	private String corPena;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave");
	}
	public void fazerNinho() {
		System.out.println("Construindo ninho");
	}
}