package correcao;

public class parte1 {

	public static void main(String[] args) {
		ComprarTelevisores compra = new ComprarTelevisores ("Televisor A", 100, 10);
		int cantidad = 5;
		double precioTotal = compra.comprarTelevisor(cantidad);
		System.out.println("El precio total por: " + cantidad);
		
	}
	
	public static class ComprarTelevisores {
		String televisor;
		int precioDiarioMes;
		int descuento;
		
	public ComprarTelevisores(String televisor ,int precioDiarioMes, int descuento) {
		this.televisor = televisor;
		this.precioDiarioMes = precioDiarioMes;
		this.descuento = descuento;
		}
	
	public double comprarTelevisor (int cantidad) {
		double precioTotal = cantidad * precioDiarioMes;
		double descuentoAplicado = precioTotal * (descuento / 100);
		return precioTotal - descuentoAplicado;
	}
	}
	
}
