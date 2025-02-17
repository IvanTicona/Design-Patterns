package InterfacePractice.Exercise7;

public class Inventario {
    public void comprobarProducto(Producto p) {
        System.out.println("Se analiza el producto " + p);
        p.obtenerStock();
        p.obtenerPrecio();
    }

    public void verificarAlmacenable(Almacenable a) {
        System.out.println("Se analiza el almacenable " + a);
        a.guardarEnBodega();
    }
}
