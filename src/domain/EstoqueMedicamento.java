package domain;

import domain.model.Medicamento;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueMedicamento implements Estoque {
    List<Medicamento> medicamentos = new ArrayList<>();

    @Override public void listar() {
    }
    @Override public double total() {
        return 0;
    }

    @Override
    public void add(Produto prod) {

    }
}
