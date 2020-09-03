package clase3.restaurant;

public class ItemPedido {
public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
int cantidad;
Receta receta;
public ItemPedido(int cantidad, Receta receta) {
	super();
	this.cantidad = cantidad;
	this.receta = receta;
}
public void encargar() throws SinSuficientesIngredientesException {
	
}
}
