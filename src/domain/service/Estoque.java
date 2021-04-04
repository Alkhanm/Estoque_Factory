package domain.service;

import domain.model.Produto;
import java.util.List;

// Essa interface representa um estoque generico com suas operações básicas
public interface Estoque {
    // Lista todos os produtos dentro do estoque
    void listar();

    // Retorna o valor total de todos os produtos
    void valorTotal();

    // Adiciona um novo produto ao estoque
    void add(Produto produto);

    // Adiciona vários produtos ao estoque
    void addAll(List<Produto> produtos);

    // Remove um produto
    void remove(int codProduto);

}
