package domain.model;

import java.time.LocalDateTime;

public class Informatica extends Produto {
    private String marca;
    private LocalDateTime dataLancamento;
    private String cor;

    public Informatica(Integer codigo, String nome, Integer unidade, Double valor) {
        super(codigo, nome, unidade, valor);
    }
    public Informatica(Integer codigo, String nome, Integer unidade, Double valor,
                       String marca, LocalDateTime dataLancamento, String cor) {
        super(codigo, nome, unidade, valor);
        this.marca = marca;
        this.dataLancamento = dataLancamento;
        this.cor = cor;
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
