package Excepciones;

//2. Escribe una función en Java que reciba como parámetros un entero n y un array de enteros de longitud n y devuelva la
//	 media de los números en el array. Si el array está vacío, la función debe lanzar una excepción de tipo IllegalArgumentException
//   con un mensaje explicando el error.
public class Ejercicio2 {
	public static double calcularMedia(int array []) {
		if (array.length == 0) {
			throw new IllegalArgumentException("El array está vacio");
		}
		
		int suma = 0;
		for (int num : array) {		//creando for each para aplicar la cuenta de suma en la array
			suma = suma + num;		//logica de la suma
		}
		double sumaTotal = (double) suma; //Convertir la suma a tipo double
		double media = sumaTotal / array.length; //calcular la media dividiendo la suma total por la longitud del array
		return media; //Devolver la media calculada
		
	}
}