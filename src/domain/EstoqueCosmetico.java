package domain;

import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueCosmetico implements Estoque {
    List<Produto> cosmeticos = new ArrayList<>();

    @Override public void listar() {
        cosmeticos.forEach(System.out::println);
    }

    @Override public double total() {
        return 0;
    }
}
