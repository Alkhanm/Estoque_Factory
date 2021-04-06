import domain.model.Alimento;
import domain.model.Cosmetico;
import domain.model.Informatica;
import domain.model.Produto;
import domain.service.Estoque;
import domain.service.EstoqueAlimento;
import domain.service.EstoqueInformatica;
import domain.service.factories.Factory;
import domain.service.factories.enums.TipoNegocio;

import java.time.LocalDateTime;
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
                new Cosmetico( 1, "Shampoo", 2, 25.0, 1.5),
                new Cosmetico(5, "Hidratante", 3, 17.0, 0.5),
                new Cosmetico(17, "Filtro solar", 2, 9.0, 0.8),
                new Alimento(2, "Arroz", 3, 25.0, 5.0,
                        LocalDateTime.now(), LocalDateTime.of(2021, 8, 3, 0, 0)),
                new Alimento(9, "Soja", 4, 12.0, 2.0,
                        LocalDateTime.of(2020, 3, 21, 0, 0), LocalDateTime.of(2021, 1, 2, 0, 0)),
                new Informatica(6, "IPhone X", 2, 3500.0,
                        "Apple",  "branco"),
                new Informatica(10, "Notebook ruim", 1, 1665.0,
                        "Positivo",  "preto"),
                new Informatica(21, "Teclado de qualidade duvidosa123", 3, 125.0,
                        "Positivo",  "preto"),
                new Informatica(34, "Teclado Mecanico Acer",  2, 799.0,
                        "Acer",  "preto")
        ));

        //                                F A C T O R I E S

        System.out.println("-------------------------------------------------------------------------------");
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
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-------------------------> ESTOQUE DE ALIMENTOS <-----------------------------");
        /* Transforma a variavel estoque em um obejto EstoqueAlimento*/
        estoque = Factory.getEstoque(TipoNegocio.ALIMENTO);
        estoque.adicionarTodos(produtos);
        estoque.listar();
        estoque.valorTotal();
        //Metódos proprios do "EstoqueAlimentos"
        //Realiza um "cast" no estoque gênerico para que ele possa acessar os metódos especificos da implementação "EstoqueAlimentp"
        ((EstoqueAlimento)estoque).getPesoTotalAlimentos();
        ((EstoqueAlimento)estoque).listarVencidos();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("-------------------------> ESTOQUE DE INFORMATICA <----------------------------");
        estoque = Factory.getEstoque(TipoNegocio.INFORMATICA);
        estoque.adicionarTodos(produtos);
        //Usa a Factory de produtos
        estoque.listar();
        estoque.valorTotal();
        //Metódos proprios do "EstoqueAlimentos"
        ((EstoqueInformatica)estoque).filtrarMarca("Positivo");
    }
}