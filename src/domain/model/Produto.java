package domain.model;

import domain.TipoProduto;

public abstract class Produto {
    protected Integer codigo;
    protected String nome;
    protected Integer unidade;
    protected Double valor;

    public abstract TipoProduto getCategoria();

    @Override public String toString() {
        return getCategoria().toString();
    }
}
