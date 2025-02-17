package InterfacePractice.Exercise4;

public class Compra {

    private double precio;
    private MetodoPago metodoPago;
    private Facturable facturable;

    public Compra(double precio, MetodoPago metodoPago, Facturable facturable) {
        this.precio = precio;
        this.metodoPago = metodoPago;
        this.facturable = facturable;
    }

    public void procesarCompra(){
        metodoPago.procesarPago(precio);
        facturable.generarFactura();
    }
}
