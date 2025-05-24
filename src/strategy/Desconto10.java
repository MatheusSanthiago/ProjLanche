
package strategy;

public class Desconto10 implements Desconto {
    public double aplicar(double preco) {
        return preco * 0.9;
    }
}