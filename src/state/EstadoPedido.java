
package state;

public interface EstadoPedido {
    void proximoEstado(Pedido pedido);
    String getEstado();
}
