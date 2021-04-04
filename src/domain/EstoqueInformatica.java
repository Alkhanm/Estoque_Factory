package domain;

import domain.model.Informatica;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueInformatica implements Estoque {
    List<Informatica> informaticas = new ArrayList<>();

    @Override public void listar() {
    }
    @Override public double total() {
        return 0;
    }

    @Override
    public void add(Produto prod) {

    }
}
