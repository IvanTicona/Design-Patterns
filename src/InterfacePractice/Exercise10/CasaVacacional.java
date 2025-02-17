package InterfacePractice.Exercise10;

public class CasaVacacional implements Reservable {
    private String nombre;
    private String direccion;

    public CasaVacacional(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void reservar(String fecha) {
        System.out.println("Reservando casa vacacional " + nombre + " para la fecha " + fecha);
    }

    public void cancelarReserva() {
        System.out.println("Cancelando reserva de casa vacacional " + nombre);
    }
}
