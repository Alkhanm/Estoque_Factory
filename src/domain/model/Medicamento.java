package domain.model;

import domain.TipoProduto;

public class Medicamento extends Produto{

    public Medicamento(Integer codigo, String nome, Integer unidade, Double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidade = unidade;
        this.valor = valor;
    }

    @Override public TipoProduto getCategoria() {
        return TipoProduto.MEDICAMENTO;
    }
}
