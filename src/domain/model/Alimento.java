package domain.model;

import java.time.LocalDateTime;

//Classe que representa um produto alimenticio
public class Alimento extends Produto {
    //Além de receber todos os atributos básicos de alimento, essa classe também adiciona os seu próprios
    private double peso = 0.0;
    private LocalDateTime fabricacao;
    private LocalDateTime vencimento;


    public Alimento(){}
    //Construtor simples (esse vem da superclasse Produto)
    public Alimento(Integer codigo, String nome, Integer unidade, Double valor) {
        super(codigo, nome, unidade, valor);
    }

    public Double getPeso() {
        return peso;
    }
    public LocalDateTime getFabricacao() {
        return fabricacao;
    }
    public LocalDateTime getVencimento() {
        return vencimento;
    }

    @Override
    public String toString() {
        return " Codigo: " + codigo + ", Nome: " + nome + ", unidade: " + unidade + ", valor: " + valor +
               " peso: " + peso + ", fabricacao: " + fabricacao + ", vencimento: " + vencimento;
    }
}
