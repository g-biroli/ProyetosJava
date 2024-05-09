package escrituraPrimos;

import java.io.FileWriter;
import java.io.IOException;

//1. Escribe un programa que guarde en un fichero con nombre primos.txt los n�meros primos que hay entre 1 y 500. (PrimosEscribir.java)
public class PrimosEscribir {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("primos.txt");	//Creando el archivo txt -> Usando el metodo ya creado padron en java FileWrite
			for (int i = 1; i < 501; i++) {
				if (esPrimo(i)) {
					fw.write(String.valueOf(i) + "\n");
				}
			}
			fw.close();
		}catch (IOException ioe) {
			System.out.println("Error de escritura");
		}

	}

	private static boolean esPrimo(int i) {
		// TODO Auto-generated method stub
		return false;
	}

}