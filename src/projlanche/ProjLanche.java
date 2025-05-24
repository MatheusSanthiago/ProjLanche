
package projlanche;

import factory.LancheFactory;
import factory.Lanche;
import strategy.Desconto;
import strategy.Desconto10;
import strategy.SemDesconto;
import state.Pedido;
import projlanche.PedidoManager;
import projlanche.LancheAntigoAdapter;
import java.util.Scanner;
import java.util.UUID;



public class ProjLanche {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("🍔 Bem-vindo ao Sistema de Pedidos de Lanche");
        System.out.println("=========================================\n");

        System.out.println("Escolha o lanche desejado:");
        System.out.println("1 - Hambúrguer");
        System.out.println("2 - Lanche antigo");
        System.out.print(">> ");
        int tipoLanche = scanner.nextInt();

        // Criando o lanche com base na escolha do usuário
        Lanche lanche = LancheFactory.criarLanche(tipoLanche);
        lanche.preparar();  // Chama o método para preparar o lanche

        System.out.println("\n-----------------------------------------");
        System.out.println("Deseja aplicar desconto?");
        System.out.println("1 - 10% de desconto");
        System.out.println("2 - Sem desconto");
        System.out.print(">> ");
        int tipoDesconto = scanner.nextInt();
        
        // Aplica o desconto baseado na escolha
        Desconto desconto;
        if (tipoDesconto == 1) {
            desconto = new Desconto10();
        } else {
            desconto = new SemDesconto();
        }

        // Calcula o preço final
        double precoFinal = desconto.aplicar(lanche.getPreco());
        System.out.println("\nPreço final: R$" + precoFinal);

        // Processo de pedido
        Pedido pedido = new Pedido();
        pedido.progredir(); // Novo → Preparando
        pedido.progredir(); // Preparando → Pronto

        // Registra o pedido
        PedidoManager.getInstancia().registrarPedido();
        System.out.println("Obrigado pelo pedido!");
        
        PedidoManager.getInstancia().registrarPedido();
        
        // ID do Pedido
        String idPedido = UUID.randomUUID().toString();
        System.out.println("ID do Pedido: " + idPedido);
    }
}