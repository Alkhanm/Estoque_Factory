package domain.model;

import domain.TipoProduto;

public class Informatica extends Produto {

    public Informatica(Integer codigo, String nome, Integer unidade, Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidade = unidade;
        this.valor = valor;
    }

    @Override public TipoProduto getCategoria() {
        return TipoProduto.INFORMATICA;
    }
}