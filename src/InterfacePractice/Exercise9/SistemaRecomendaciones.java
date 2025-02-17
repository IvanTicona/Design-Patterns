package InterfacePractice.Exercise9;

import java.util.LinkedList;
import java.util.List;

public class SistemaRecomendaciones {
    private List<Producto> productos = new LinkedList<>();
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public void recomendar(Recomendable recomendable) {
        recomendable.obtenerRecomendaciones();
    }
}
