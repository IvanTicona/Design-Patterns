package InterfacePractice.Exercise10;

public class Hotel implements Reservable, Calificable {
    private String nombre;
    private String direccion;

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void reservar(String fecha) {
        System.out.println("Reservando hotel " + nombre + " para la fecha " + fecha);
    }

    public void cancelarReserva() {
        System.out.println("Cancelando reserva de hotel " + nombre);
    }

    public void calificar(int estrellas) {
        System.out.println("Calificando hotel " + nombre + " con " + estrellas + " estrellas");
    }
}
