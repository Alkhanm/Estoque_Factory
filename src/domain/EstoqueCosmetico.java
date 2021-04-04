package domain;

import domain.model.Cosmetico;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueCosmetico implements Estoque {
    List<Cosmetico> cosmeticos = new ArrayList<>();

    @Override public void listar() {
        cosmeticos.forEach(System.out::println);
    }

    @Override public double total() {
        return 0;
    }

    @Override public void add(Produto prod) {
        if (prod.getCategoria().equals(TipoProduto.COSMETICO)){
            cosmeticos.add((Cosmetico)prod);
        }
    }
}
