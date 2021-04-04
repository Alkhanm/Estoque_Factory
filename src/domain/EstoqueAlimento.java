package domain;

import domain.model.Alimento;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueAlimento implements Estoque {
    List<Alimento> alimentos = new ArrayList<>();

    @Override public void listar() {
    }

    @Override public double total() {
        return 0;
    }

    @Override public void add(Produto prod) {
       if (prod.getCategoria().equals(TipoProduto.ALIMENTO)){
           alimentos.add((Alimento)prod);
       }
    }
}
