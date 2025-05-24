
package factory;

import factory.Hamburguer;
import factory.Lanche;
import projlanche.LancheAntigoAdapter; // Adapter vem do pacote projlanche
import projlanche.LancheAntigoAdapter;

public class LancheFactory {
    public static Lanche criarLanche(int tipo) {
        switch (tipo) {
            case 1:
                return new Hamburguer();
            case 2:
                return new LancheAntigoAdapter(); // Adapter funcionando aqui
            default:
                throw new IllegalArgumentException("Tipo inválido");
        }
    }
}