package domain;

import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueAlimento implements Estoque {
    List<Produto> alimentos = new ArrayList<>();

    @Override public void listar() {
    }

    @Override public double total() {
        return 0;
    }
}
