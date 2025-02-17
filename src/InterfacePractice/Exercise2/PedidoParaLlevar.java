package InterfacePractice.Exercise2;

public class PedidoParaLlevar implements Pedido {
    public void preparar() {
        System.out.println("Preparando pedido para llevar");
    }

    public void entregar() {
        System.out.println("Entregando pedido para llevar");
    }
}
