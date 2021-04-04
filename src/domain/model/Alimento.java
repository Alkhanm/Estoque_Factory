package domain.model;
import java.time.LocalDateTime;

//Classe que representa um produto alimenticio
public class Alimento extends Produto {
    //Além de receber todos os atributos básicos de alimento, essa classe também adiciona os seu próprios
    private Double peso;
    private LocalDateTime fabricacao;
    private LocalDateTime vencimento;


    //Construtor simples (esse vem da superclasse Produto)
    public Alimento(Integer codigo, String nome, Integer unidade, Double valor) {
        super(codigo, nome, unidade, valor);
    }
    //Construtor simples (esse além do construtor da superclasse, possui atributos especificos da classe Alimento)
    public Alimento(Integer codigo, String nome, Integer unidade, Double valor,
                    Double peso, LocalDateTime fabricacao, LocalDateTime vencimento) {
        super(codigo, nome, unidade, valor);
        this.peso = peso;
        this.fabricacao = fabricacao;
        this.vencimento = vencimento;
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
