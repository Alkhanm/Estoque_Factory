package domain.service;

import domain.model.Alimento;
import domain.model.Produto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Implementa os métodos definidos na interface "Estoque"
// Essa classe gerência o estoque de produtos alimenticios
public class EstoqueAlimento implements Estoque {
    List<Alimento> listaAlimentos = new ArrayList<>();

    // Retorna o peso total de todos os alimentos
    public void getPesoTotalAlimentos(){
        double pesoTotal = listaAlimentos.stream()
                .map(p -> p.getPeso() * p.getUnidade()) // Transforma em um array contendo todos os pesos
                .reduce(Double::sum) // Soma todos os pesos
                .orElse(0.0); // Se não houver nem um item, retorna peso 0.0
        System.out.println("Peso total dos alimentos: " + pesoTotal);
    }
    //Lista os produtos que já estão vencidos
    public void listarVencidos(){
        System.out.println("Produtos vencidos: ");
        listaAlimentos.stream()
                .filter(p -> p.getVencimento().isBefore(LocalDateTime.now()))
                .forEach(System.out::println);
    }

    //Lista todos os produtos alimenticios
    @Override public void listar() {
        //Esse pequeno método é uma "lambda function" que irá imprimir cada um dos produtos
        listaAlimentos.forEach(System.out::println);
    }

    //Retorna o valor total dos produtos
    /* 1. Cria um "stream" de dados
    ** 2. Transforma em uma lista contendo de cada produto (unidade * valor)
    ** 3. Soma o total de todos os produtos e retorna um "double" */
    @Override public void valorTotal() {
       double total = listaAlimentos.stream()
               .map((v) -> v.getUnidade() * v.getValor())
               .reduce(0.0, Double::sum);
        System.out.println("O valor total: " + total);
    }
    //Adiciona um novo produto
    @Override public void add(Produto ali) {
        //Só adiciona os produtos que são do tipo Alimento
        if (ali instanceof Alimento) this.listaAlimentos.add((Alimento) ali);
    }

    //Adiciona varios produtos
    @Override public void addAll(List<Produto> produtos) {
        produtos.forEach(this::add); //Usa o metodo "add" da classe
    }

    @Override public void remove(int codProduto) {
        this.listaAlimentos.removeIf(alimento -> alimento.getCodigo().equals(codProduto));
    }

}
