package domain;

import domain.model.Produto;

public interface Estoque {
    //medicamento, alimentação, informatica, cosmeticos
    void listar();
    double total();
    void add(Produto prod);
}
