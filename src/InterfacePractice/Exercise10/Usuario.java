package InterfacePractice.Exercise10;

public class Usuario {
    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void hacerReserva(Reservable reservable, String fecha) {
        reservable.reservar(fecha);
    }

    public void cancelarReserva(Reservable reservable) {
        reservable.cancelarReserva();
    }
}
