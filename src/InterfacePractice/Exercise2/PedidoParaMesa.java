package InterfacePractice.Exercise2;

public class PedidoParaMesa implements Pedido {
    public void preparar() {
        System.out.println("Preparando pedido para mesa");
    }

    public void entregar() {
        System.out.println("Entregando pedido para mesa");
    }
}
