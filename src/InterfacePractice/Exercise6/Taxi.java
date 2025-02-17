package InterfacePractice.Exercise6;

public class Taxi implements TransportePublico {
    private String origen;
    private String destino;
    private double tarifa;
    private Conductor conductor;

    public Taxi(Conductor conductor) {
        this.conductor = conductor;
    }

    public void iniciarViaje(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public void calcularTarifa() {
        tarifa = 5 + (5 * 1.5);
    }
}
