import domain.model.Produto;
import domain.service.Estoque;
import domain.service.EstoqueAlimento;
import domain.service.EstoqueInformatica;
import domain.service.factories.Factory;
import domain.service.factories.enums.TipoNegocio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Uma lista gênericas de produtos.
        ** Todos esse produtos possuem a mesma superclasse (Produto)
        ** No entanto, observe que não são do mesmo tipo de objeto */
        //                          L I S T A    D E    P R O D U T O S
        List<Produto> produtos = new ArrayList<>(Arrays.asList(
                //Cosmeticos
                Factory.getProduto(TipoNegocio.COSMETICO, 1, "Shampoo", 2, 25.0),
                Factory.getProduto(TipoNegocio.COSMETICO,5, "Hidratante", 3, 17.0),
                Factory.getProduto(TipoNegocio.COSMETICO,17, "Filtro solar", 2, 9.0),
                //Alimentos
                Factory.getProduto(TipoNegocio.ALIMENTO,2, "Arroz", 3, 25.0),
                Factory.getProduto(TipoNegocio.ALIMENTO,9, "Soja", 4, 12.0),
                //Informatica
                Factory.getProduto(TipoNegocio.INFORMATICA,6, "IPhone X", 2, 3500.0),
                Factory.getProduto(TipoNegocio.INFORMATICA,10, "Redmi Note 8", 1, 1665.0),
                Factory.getProduto(TipoNegocio.INFORMATICA,21, "Redmi Air Dots", 3, 125.0)
        ));
        //                                F A C T O R I E S

        System.out.println("-------------------------> ESTOQUE DE COSMETICOS <----------------------------");
        //Interface que representa um estoque genêrico
        Estoque estoque;
         /* Essa interface "Estoque" recebera um implementa do especializada no gerenciamento de cosmeticos
         ** Essa implementação será do tipo "EstoqueCosmetico" **/
        estoque = Factory.getEstoque(TipoNegocio.COSMETICO);
        estoque.adicionarTodos(produtos); // Só adicionara produtos que forem do tipo cosmético
        estoque.listar(); // Imprime no console todos os produtos do EstoqueCosmetico
        estoque.valorTotal(); // Retorna o valor todos dos cosmeticos (unidade * valor)
        estoque.remover(5);
        estoque.listar();

        System.out.println("-------------------------> ESTOQUE DE ALIMENTOS <-----------------------------");
        /* Transforma a variavel estoque em um obejto EstoqueAlimento*/
        estoque = Factory.getEstoque(TipoNegocio.ALIMENTO);
        estoque.adicionarTodos(produtos);
        estoque.listar();
        estoque.valorTotal();
        //Metódos proprios do "EstoqueAlimentos"
        ((EstoqueAlimento)estoque).getPesoTotalAlimentos();
        ((EstoqueAlimento)estoque).listarVencidos();

        System.out.println("-------------------------> ESTOQUE DE INFORMATICA <----------------------------");
        estoque = Factory.getEstoque(TipoNegocio.INFORMATICA);
        estoque.adicionarTodos(produtos);
        //Usa a Factory de produtos
        estoque.adicionar(Factory.getProduto(TipoNegocio.INFORMATICA,
                34, "Teclado Mecanico",  2, 799.0));
        estoque.adicionar(Factory.getProduto(TipoNegocio.INFORMATICA,
                31, "Monitor G2460V", 1, 880.0));
        estoque.adicionar(Factory.getProduto(TipoNegocio.INFORMATICA,
                32, "Notebook Expert x23", 4, 2690.0));
        estoque.listar();
        estoque.valorTotal();
        //Metódos proprios do "EstoqueAlimentos"
        ((EstoqueInformatica)estoque).listarMarca("Apple");
    }
}