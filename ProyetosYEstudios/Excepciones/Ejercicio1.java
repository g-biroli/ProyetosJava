import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int numero;
		int count=1;
		
		do {
			try {
				System.out.println("Dime un numero " + count + " :");
				numero=sc.nextInt();
				if (count == 1 || numero > max) {
					max = numero;
				}
				count++;
			} catch (InputMismatchException e) {
				System.out.println("Error, se debe introducir un numero entero.");
				sc.next();
			}
		} while (count < 7); //test
		
		System.out.println("El numero maximo es igual a : " + max);
	}
}