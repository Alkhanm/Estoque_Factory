package domain.model;

//Representa os atributos e metodos básicos de qualquer produto
public abstract class Produto {
    protected int codigo;
    protected String nome;
    protected int unidade = 0;
    protected double valor = 0.0;

    public Produto(){}
    public Produto(int codigo,String nome, int unidade, double valor ) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidade = unidade;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return this.nome;
    }
    public Integer getUnidade() {
        return unidade;
    }
    public Double getValor() {
        return valor;
    }

    @Override public String toString() {
        return " Codigo: " + codigo + ", Nome: " + nome + ", unidade: " + unidade + ", valor: " + valor;
    }
}
