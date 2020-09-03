package clase3.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Stock {
List<Producto> stock;
public Stock() {
	stock=new ArrayList<Producto>();
}
public void agregar(Producto p, int cantidad) {
	if(stock.indexOf(p)>=0)
		p.setStock(p.getStock()+cantidad);
	else {
		p.setStock(cantidad);
		stock.add(p);
	}
		
}
}
