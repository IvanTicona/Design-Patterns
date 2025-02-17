package InterfacePractice.Exercise6;

public class Bus implements TransportePublico {
    private String origen;
    private String destino;
    private double tarifa;

    public Bus() {
    }

    public void iniciarViaje(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public void calcularTarifa() {
        tarifa = 2 + (2 * 1.5);
    }
}
