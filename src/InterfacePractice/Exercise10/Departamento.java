package InterfacePractice.Exercise10;

public class Departamento implements Reservable {
    private String nombre;
    private String direccion;

    public Departamento(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void reservar(String fecha) {
        System.out.println("Reservando departamento " + nombre + " para la fecha " + fecha);
    }

    public void cancelarReserva() {
        System.out.println("Cancelando reserva de departamento " + nombre);
    }
}
