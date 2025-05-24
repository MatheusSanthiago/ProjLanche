
package state;


public class Novo implements EstadoPedido {
    public void proximoEstado(Pedido pedido) {
        pedido.setEstado(new Preparando());
    }

    public String getEstado() {
        return "Novo";
    }
}