package InterfacePractice.Exercise6;

public class BicicletaCompartida implements TransportePublico {
    private String origen;
    private String destino;
    private double tarifa;

    public BicicletaCompartida() {
    }

    public void iniciarViaje(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public void calcularTarifa() {
        tarifa = 1;
    }
}
