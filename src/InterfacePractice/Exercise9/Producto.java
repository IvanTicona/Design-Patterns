package InterfacePractice.Exercise9;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;

    public Producto(String nombre, String categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return nombre;
    }
}
