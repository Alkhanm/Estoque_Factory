package domain.service;

import domain.model.Alimento;
import domain.model.Cosmetico;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class EstoqueCosmetico implements Estoque {
    List<Cosmetico> listaCosmeticos = new ArrayList<>();


    @Override public void listar() {
        listaCosmeticos.forEach(System.out::println);
    }

    @Override public void valorTotal() {
        double total = listaCosmeticos.stream()
                .map((v) -> v.getUnidade() * v.getValor())
                .reduce(0.0, Double::sum);
        System.out.println("O valor total: R$ " + total);
    }

    @Override public void adicionar(Produto prod) {
        if (prod instanceof Cosmetico) this.listaCosmeticos.add((Cosmetico)prod);
    }

    @Override public void adicionarTodos(List<Produto> produtos) {
        produtos.forEach(this::adicionar);
    }

    @Override public void remover(int codProduto) {
        this.listaCosmeticos.removeIf(alimento -> alimento.getCodigo().equals(codProduto));
        System.out.println("Produto de código " + codProduto + " removido");
    }
}
