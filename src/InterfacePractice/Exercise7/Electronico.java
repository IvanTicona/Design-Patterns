package InterfacePractice.Exercise7;

public class Electronico implements Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Electronico(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void obtenerPrecio() {
        System.out.println("El precio del producto " + nombre + " es: " + precio);
    }

    public void obtenerStock() {
        System.out.println("El stock del producto " + nombre + " es: " + stock);
    }
}
