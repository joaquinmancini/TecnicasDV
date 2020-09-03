package clase3.restaurant;
import java.util.List;

public class Receta {
	List<ItemReceta> ingredientes;
	String nombre;
	String tiempoDeCoccion;
	float precioVenta;
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}
	public void setTiempoDeCoccion(String tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}
	public void addIngrediente(ItemReceta i) {
		
		ingredientes.add(i);
	}
	
	public void addIngrediente(Producto producto, int cantidad ) {
		ItemReceta item=new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
}
