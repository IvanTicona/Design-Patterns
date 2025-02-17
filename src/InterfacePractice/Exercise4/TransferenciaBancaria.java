package InterfacePractice.Exercise4;

public class TransferenciaBancaria implements MetodoPago{
    public void procesarPago(double monto){
        System.out.println("Pago realizado con transferencia bancaria por: " + monto);
    }
}
