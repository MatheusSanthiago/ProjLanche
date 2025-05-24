
package state;

public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new Novo();
    }

    public void progredir() {
        System.out.println("Estado do pedido: " + estado.getEstado());
        estado.proximoEstado(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public String getEstadoAtual() {
        return estado.getEstado();
    }
}
