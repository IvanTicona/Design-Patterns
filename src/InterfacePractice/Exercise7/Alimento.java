package InterfacePractice.Exercise7;

import java.time.LocalDate;

public class Alimento implements Producto, Almacenable {
    private String nombre;
    private double precio;
    private int stock;
    private LocalDate fechaDeCaducidad;

    public Alimento(String nombre, double precio, int stock, LocalDate fechaDeCaducidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public void obtenerPrecio() {
        System.out.println("El precio del producto " + nombre + " es: " + precio);
    }

    public void obtenerStock() {
        System.out.println("El stock del producto " + nombre + " es: " + stock);
    }

    public void guardarEnBodega() {
        // Validar que la fecha de caducidad no haya pasado
        if (fechaDeCaducidad.isAfter(LocalDate.now())) {
            System.out.println("El producto ha sido guardado en la bodega");
        } else {
            System.out.println("El producto no puede ser guardado en la bodega porque está caducado");
        }
    }

    public void retirarDeBodega() {
        System.out.println("El producto ha sido retirado de la bodega");
    }
}
