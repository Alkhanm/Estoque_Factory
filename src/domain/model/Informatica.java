package domain.model;

import java.time.LocalDateTime;

public class Informatica extends Produto {
    private String marca;
    private String cor;

    public Informatica(){}
    public Informatica(Integer codigo, String nome, Integer unidade, Double valor,
                      String marca, String cor) {
        super(codigo, nome, unidade, valor);
        this.marca = marca;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return " Codigo: " + codigo + ", Nome: " + nome + ", unidade: " + unidade + ", valor: " + valor +
                " marca: " + marca + ", cor: " + cor ;
    }
}
