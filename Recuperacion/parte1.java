package extraordinaria;

public class Parte1 {

	public static void main(String[] args) {
		ComprarAuto comprar = new ComprarAuto("Coche 1", 2000, 100);
		int cantidad = 5;
		double precioTotal = comprar.compraAuto(cantidad);
		System.out.println("El precio total por: " + cantidad);
	}
	
	public static class ComprarAuto{
		String coche;
		int precioDiario;
		int descuento;
		
	public ComprarAuto(String coche, int precioDiario, int descuento) {
			this.coche = coche;
			this.precioDiario = precioDiario;
			this.descuento = descuento;
		}
	public double compraAuto(int cantidad) {
		double precioTotal = precioDiario * cantidad;
		double descuentoTotal = precioTotal * (descuento / 100);
		return precioTotal - descuentoTotal;
	}	
	}
		
}
