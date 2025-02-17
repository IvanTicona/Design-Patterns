package InterfacePractice.Exercise2;

public class PedidoDomicilio implements Pedido{

    private Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {  //Inyectando dependecia
        this.repartidor = repartidor;
    }

    public void preparar() {
        System.out.println("Preparando pedido a domicilio");
    }

    public void entregar() {
        repartidor.repartir();
        System.out.println("Entregando pedido a domicilio");
    }
}
