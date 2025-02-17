package InterfacePractice.Exercise6;

public class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void solicitarViaje(TransportePublico transporte, String origen, String destino) {
        transporte.iniciarViaje(origen, destino);
        transporte.calcularTarifa();
    }
}
