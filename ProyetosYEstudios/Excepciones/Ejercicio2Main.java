package Excepciones;

public class Ejercicio2Main {

	public static void main(String[] args) {
		try {												//creando las array para el test + creano el system.out.println para mostrar array calculada
				int array1 [] = {0,1,2,3,4,5,6,7,8,9,10};
				int array2 [] = {0,2,4,6,8,10};
				int array3 [] = {}; //array vacia
			
				System.out.println("Media del Array 1: " + Ejercicio2.calcularMedia(array1));
				System.out.println("Media del Array 2: " + Ejercicio2.calcularMedia(array2));
				System.out.println("Media del Array 3: " + Ejercicio2.calcularMedia(array3));
		} catch (IllegalArgumentException e) {				//creando el catch con la exception pre definida y llamando de "e"
				System.out.println("Error: " + e.getMessage());
		}

	}

}