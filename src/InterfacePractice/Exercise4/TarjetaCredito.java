package InterfacePractice.Exercise4;

public class TarjetaCredito implements MetodoPago{
    public void procesarPago(double monto){
        System.out.println("Pago realizado con tarjeta de crédito por: " + monto);
    }
}
