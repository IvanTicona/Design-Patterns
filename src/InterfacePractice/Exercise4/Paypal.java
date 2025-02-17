package InterfacePractice.Exercise4;

public class Paypal implements MetodoPago{
    public void procesarPago(double monto){
        System.out.println("Pago realizado con Paypal por: " + monto);
    }
}
