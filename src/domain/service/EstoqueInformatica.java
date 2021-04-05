package domain.service;
import domain.model.Informatica;
import domain.model.Produto;

import java.util.ArrayList;
import java.util.List;

// Implementa os métodos definidos na interface "Estoque"
// Essa classe gerência o estoque de produtos de informatica
public class EstoqueInformatica implements Estoque {
    List<Informatica> listaInformaticos = new ArrayList<>();


    //Lista apenas os produtos informaticos de uma determinda marca
    public void listarMarca(String marca){
        System.out.println("Listando informaticos da marca: " + marca);
        listaInformaticos.stream()
                .filter(p -> marca.equalsIgnoreCase(p.getMarca()))
                .forEach(System.out::println);
    }

    @Override public void listar() {
        listaInformaticos.forEach(System.out::println);
    }

    @Override public void valorTotal() {
        double total = listaInformaticos.stream()
                .map((v) -> v.getUnidade() * v.getValor())
                .reduce(0.0, Double::sum);
        System.out.println("O valor total: " + total);
    }

    @Override public void adicionar(Produto prod) {
        if (prod instanceof Informatica) {
            this.listaInformaticos.add((Informatica) prod);
        }
    }

    @Override public void adicionarTodos(List<Produto> produtos) {
        produtos.forEach(this::adicionar);
    }

    @Override public void remover(int codProduto) {
        this.listaInformaticos.removeIf(alimento -> alimento.getCodigo().equals(codProduto));
        System.out.println("Produto de código " + codProduto + " removido");
    }
}
