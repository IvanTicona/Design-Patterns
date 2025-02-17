package InterfacePractice.Exercise7;

public class Ropa implements Producto {
    private String nombre;
    private String talla;
    private double precio;
    private int stock;

    public Ropa(String nombre, String talla, double precio, int stock) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
        this.stock = stock;
    }

    public void obtenerPrecio() {
        System.out.println("El precio del producto " + nombre + " talla " + talla + " es: " + precio);
    }

    public void obtenerStock() {
        System.out.println("El stock del producto " + nombre + " talla " + talla + " es: " + stock);
    }
}
