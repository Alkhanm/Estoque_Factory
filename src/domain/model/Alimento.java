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
    public Alimento(Integer codigo, String nome, Integer unidade, Double valor,
                    double peso, LocalDateTime fabricacao , LocalDateTime vencimento ) {
        super(codigo, nome, unidade, valor);
        this.peso = peso;
        this.fabricacao = fabricacao;
        this.vencimento = vencimento;
    }


    public Double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public LocalDateTime getFabricacao() {
        return fabricacao;
    }
    public LocalDateTime getVencimento() {
        return vencimento;
    }
    public void setVencimento(LocalDateTime vencimento) {
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return " Codigo: " + codigo + ", Nome: " + nome + ", unidade: " + unidade + ", valor: " + valor +
               " peso: " + peso + ", fabricacao: " + fabricacao + ", vencimento: " + vencimento;
    }
}
