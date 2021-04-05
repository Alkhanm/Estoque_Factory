package domain.model;

public class Cosmetico extends Produto {
    private double peso = 0.0;

    public Cosmetico(){}
    public Cosmetico(Integer codigo,String nome, Integer unidade, Double valor ) {
        super(codigo, nome, unidade, valor);
    }
    public Cosmetico of(Integer codigo,String nome, Integer unidade, Double valor, Double peso ) {
            this.codigo = codigo;
            this.nome = nome;
            this.unidade = unidade;
            this.valor = valor;
            this.peso = peso;
            return this;
    }

    public Double getPeso() {
        return peso;
    }
}