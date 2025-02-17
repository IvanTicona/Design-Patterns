package InterfacePractice.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedidos;
    public Restaurante() {
        this.pedidos = new ArrayList<Pedido>();
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
        System.out.println("Tenemos un nuevo pedido 📝");
    }

    public void gestionarPedidos() {
        for (Pedido pedido : this.pedidos) {
            pedido.preparar();
            pedido.entregar();
        }
    }
}
