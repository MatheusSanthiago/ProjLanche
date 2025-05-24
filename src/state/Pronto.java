
package state;

public class Pronto implements EstadoPedido {
    public void proximoEstado(Pedido pedido) {
        System.out.println("Pedido já está pronto!");
    }

    public String getEstado() {
        return "Pronto!";
    }
}
