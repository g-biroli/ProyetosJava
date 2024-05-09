package lecturaPrimos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//2. Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por pantalla.
//	(PrimosLeer.java)
public class PrimosLeer {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new  FileReader("primos.txt"));
			String linea; //cree una linea para que me organize mediante el control del archivo -> linea 1, linea 2.
			while((linea = br.readLine()) != null) {	//condicion para que la linea no estea vacia
				System.out.println(linea + " ");
				linea = br.readLine();
		} 
			br.close();
	}	catch (IOException e) {
		System.out.println("Error de lectura.");
	}
  }
}