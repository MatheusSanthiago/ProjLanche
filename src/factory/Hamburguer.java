
package factory;

import factory.Lanche;

public class Hamburguer implements Lanche {
    public void preparar() {
        System.out.println("Preparando hambúrguer...");
    }

    public double getPreco() {
        return 20.0;
    }
}
