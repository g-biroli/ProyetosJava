package aula13;

public class Cachorro extends Lobo {
	@Override
	public void emitirSom() {
		System.out.println("AU! AU! AU!");
	}
	//Polimorfismo de sobrecarga é criar um metodo e alterar os parametros dele, assim é possivl utilizar o mesmo metodo com variaveis diferentes
	public void reagir(String frase) {
		if(frase.equals("Toma comida")|| frase.equals("Ta com fome")) {
			System.out.println("Abanando o rabo!");
		} else {
			System.out.println("Rosnar e latir!");
		}
	}
	public void reagir(int hora, int min) {
		if(hora < 12) {
			System.out.println("Abanando o rabo!");
		} else if (hora >= 18) {
			System.out.println("Latindo e ansioso!");
		} else {
			System.out.println("Ignorar!");
		}
	}
	public void reagir(boolean dono) {
		if (dono) {
			System.out.println("Abanando o rabo!");
		} else {
			System.out.println("Rosnar e latir!");
		}
	}
	public void reagir(int idade, float peso) {
		if (idade < 5 || peso < 10) {
			System.out.println("Abanando o rabo!");
		} else {
			System.out.println("Latindo! AU! AU! AU!");
		}
		if (peso > 10) {
			System.out.println("Rosnando !!!");
		} else {
			System.out.println("Ignorando . . .");
		}
	}
}