package domain.model;

//Representa os atributos e metodos básicos de qualquer produto
public abstract class Produto {
    protected Integer codigo;
    protected String nome;
    protected Integer unidade;
    protected Double valor;

    public Produto(Integer codigo,String nome, Integer unidade, Double valor ) {
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
