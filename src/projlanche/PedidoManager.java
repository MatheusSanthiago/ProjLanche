
package projlanche;

public class PedidoManager {
    private static PedidoManager instancia;

    private PedidoManager() {}

    public static PedidoManager getInstancia() {
        if (instancia == null) {
            instancia = new PedidoManager();
        }
        return instancia;
    }

    public void registrarPedido() {
        System.out.println("Pedido finalizado no sistema.");
    }
}