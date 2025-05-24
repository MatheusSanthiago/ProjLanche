
package strategy;

public class SemDesconto implements Desconto {
    public double aplicar(double preco) {
        return preco;
    }
}