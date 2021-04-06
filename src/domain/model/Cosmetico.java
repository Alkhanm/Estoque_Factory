package domain.model;

public class Cosmetico extends Produto {
    private double peso = 0.0;

    public Cosmetico(){}
    public Cosmetico (Integer codigo,String nome, Integer unidade, Double valor, Double peso ) {
           super(codigo, nome, unidade, valor);
           this.peso = peso;
    }

    public Double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return " Codigo: " + codigo + ", Nome: " + nome + ", unidade: " + unidade + ", valor: " + valor +
                " peso: " + peso;
    }
}