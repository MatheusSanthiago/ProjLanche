
package state;

public class Preparando implements EstadoPedido {
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new Pronto());
    }

    public String getEstado() {
        return "Preparando...";
    }
}