package domain.model;

public class Cosmetico extends Produto {
    private Double peso;

    public Cosmetico(Integer codigo,String nome, Integer unidade, Double valor ) {
        super(codigo, nome, unidade, valor);
    }
    public Cosmetico(Integer codigo,String nome, Integer unidade, Double valor, Double peso ) {
        super(codigo, nome, unidade, valor);
        this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }
}