package domain;

import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMedicamento implements Estoque {
    List<Produto> medicamentos = new ArrayList<>();


    @Override public void listar() {
    }
    @Override public double total() {
        return 0;
    }
}
