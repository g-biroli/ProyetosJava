public class Televisores {
	int precioDiario, descuento, cantidad, precioTotal;
	public Televisores(int precioDiario, int descuento, int cantidad, int precioTotal) {
		this.precioDiario = precioDiario;
		this.descuento = descuento;
		this.cantidad = cantidad;
		this.precioTotal = precioTotal;
	}
	public static int comprarTelevisores(int precioDiario, int cantidad, int precioTotal) {
		return precioTotal = precioDiario * cantidad;
	}
	public int getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}
	public int getPrecioDiario() {
		return precioDiario;
	}
	public void setPrecioDiario(int precioDiario) {
		this.precioDiario = precioDiario;
	}

	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}