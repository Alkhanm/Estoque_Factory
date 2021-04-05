package domain.model;

import java.time.LocalDateTime;

public class Informatica extends Produto {
    private String marca;
    private LocalDateTime dataLancamento;
    private String cor;

    public Informatica(){}
    public Informatica(Integer codigo, String nome, Integer unidade, Double valor) {
        super(codigo, nome, unidade, valor);
    }


    public String getMarca() {
        return marca;
    }

    public LocalDateTime getDataLancamento() {
        return dataLancamento;
    }

    public String getCor() {
        return cor;
    }
}
