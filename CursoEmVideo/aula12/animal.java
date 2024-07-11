package aula12;

public abstract class Animal {
	//Atributos animal
	protected float peso;
	protected int idade;
	protected int membros;
	
	//metodos abstractos
	public abstract void locomover();
	public abstract void alimentar();
	public abstract void emitirSom();
}