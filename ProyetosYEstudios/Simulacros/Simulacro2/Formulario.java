package ejercicio1;

import java.util.Scanner;

public class Formulario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String usuario = null, contraseña = null, dni = null;
		int opcion;
		Formulario formulario = new Formulario();
		
		do {
			mostrarMenu();
			System.out.println("Eliga la opcion");
			opcion = sc.nextInt();
			sc.nextLine();	
		
		switch(opcion) {
		case 1:
			System.out.println("Dime tu usuario: ");
			usuario = sc.nextLine();
			break;
		case 2:
			System.out.println("Dime tu contraseña: ");
			contraseña = sc.nextLine();
			break;
		case 3: 
			System.out.println("Dime tu DNI: ");
			dni = sc.nextLine();
			try {
				validardni(dni);
			} catch (LongitudDNINoValidaException | UltimoDigitoNoLetraException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 4:
			if (usuario != null && contraseña != null && dni != null) {
				System.out.println("Todos los datos estan rellenados.");
				sc.close();
				return;	//salir del program
			}
			}
		} while (opcion!=5);

	}
	
	
	private static void mostrarMenu() {
		System.out.println("1. Rellenar Usuario");
		System.out.println("2. Rellenar Contraseña");
		System.out.println("3. Rellenar DNI");
		System.out.println("4. Finalizar");
	}
	private static void validardni(String dni) throws LongitudDNINoValidaException, UltimoDigitoNoLetraException {
		if (dni.length() != 9) {
			throw new LongitudDNINoValidaException ("La longitud del DNI no es valida");
		}
		if (!Character.isLetter(dni.charAt(0) - 1)) {
			throw new UltimoDigitoNoLetraException("El ultimo caracter del DNI debe ser una letra");
		}
	}
	
}