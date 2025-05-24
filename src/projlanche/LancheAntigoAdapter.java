package projlanche;

import factory.Lanche;

public class LancheAntigoAdapter implements Lanche {
    private LancheAntigo lancheAntigo = new LancheAntigo();

    public void preparar() {
        lancheAntigo.prepararLancheAntigo();
    }

    public double getPreco() {
        return 15.0;
    }
}