package domain.service;
import domain.model.Alimento;
import domain.model.Informatica;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

// Implementa os métodos definidos na interface "Estoque"
// Essa classe gerência o estoque de produtos de informatica
public class EstoqueInformatica implements Estoque {
    List<Informatica> listaInformaticos = new ArrayList<>();


    @Override public void listar() {
        listaInformaticos.forEach(System.out::println);
    }

    @Override public void valorTotal() {
        double total = listaInformaticos.stream()
                .map((v) -> v.getUnidade() * v.getValor())
                .reduce(0.0, Double::sum);
        System.out.println("O valor total: " + total);
    }

    @Override public void add(Produto prod) {
        if (prod instanceof Informatica) this.listaInformaticos.add((Informatica)prod);
    }

    @Override public void addAll(List<Produto> produtos) {
        produtos.forEach(this::add);
    }

    @Override public void remove(int codProduto) {
        this.listaInformaticos.removeIf(alimento -> alimento.getCodigo().equals(codProduto));
    }
}
