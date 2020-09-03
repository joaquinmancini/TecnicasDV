package clase3.restaurant;
import java.util.List;

public class Pedido {
static int nextID=0;


List<ItemPedido> items;
Usuario usuario;
String estado;
int id;
public Pedido() {
	super();
	this.items = items;
	this.usuario = usuario;
}
public static int getNextID() {
	return nextID;
}

public static void setNextID(int nextID) {
	Pedido.nextID = nextID;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Pedido(List<ItemPedido> items, Usuario usuario) {
	super();
	this.items = items;
	this.usuario = usuario;
	estado=null;
}

void agregarItem(ItemPedido item) {
if(estado==null)
	estado="ABIERTO";
	items.add(item);
}
void eliminarItem(ItemPedido item) {
	items.remove(item);
}
float totalPedido() {
	float  acum=0.0f;
	for(int i = 0;i<items.size();i++) {
		acum+=items.get(i).cantidad*items.get(i).getReceta().getPrecioVenta();
	}
	return acum;
}

void completarPedido() {
	float total=totalPedido();
	try {
		this.getUsuario().descontarSaldo(total);
		this.setEstado("ENVIADO");
	} catch (SinSaldoException e) {
		System.out.println(e);	
	} finally {
		
	}
	
}

public List<ItemPedido> getItems() {
	return items;
}

public void setItems(List<ItemPedido> items) {
	this.items = items;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

}
