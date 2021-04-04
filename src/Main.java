import domain.service.Estoque;
import domain.service.EstoqueAlimento;
import domain.service.factories.enums.TipoProduto;
import domain.model.Alimento;
import domain.model.Cosmetico;
import domain.model.Informatica;
import domain.model.Produto;
import domain.service.factories.EstoqueFactory;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Uma lista gênericas de produtos.
        ** Todos esse produtos possuem a mesma superclasse (Produto)
        ** No entanto, observe que não são do mesmo tipo de objeto */
        //                        LISTA DE PRODUTOS
        List<Produto> produtos = new ArrayList<>(Arrays.asList(
                new Cosmetico(1, "Shampoo", 2, 25.0),
                new Cosmetico(5, "Hidratante", 3, 17.0),
                new Cosmetico(17, "Filtro solar", 2, 9.0),
                new Alimento(2, "Arroz", 3, 25.0, 5.0,
                        LocalDateTime.now(),
                        LocalDateTime.of(2021,10, 7, 1, 0)),
                new Alimento(9, "Soja", 4, 9.0, 5.0,
                        LocalDateTime.of(2020,10, 2, 1, 0),
                        LocalDateTime.of(2021, 1, 21, 1, 0)),
                new Informatica(6, "IPhone X", 2, 3500.0),
                new Informatica(10, "Redmi Note 8", 1, 1665.0),
                new Informatica(21, "Redmi Air Dots", 3, 125.0)
        ));

        System.out.println("-------------------------> ESTOQUE DE COSMETICOS <----------------------------");
         /* Essa interface "Estoque" receberá um implementa do especializada no gerenciamento de cosmeticos
         ** Essa implementação será do tipo "EstoqueCosmetico" **/
        Estoque estoqueCosmetico = EstoqueFactory.getEstoque(TipoProduto.COSMETICO);
        estoqueCosmetico.addAll(produtos); // Só adicionará produtos que forem do tipo cosmético
        estoqueCosmetico.listar(); // Imprime no console todos os produtos do EstoqueCosmetico
        estoqueCosmetico.valorTotal(); // Retorna o valor todos dos cosmeticos (unidade * valor)
        estoqueCosmetico.remove(2);
        estoqueCosmetico.listar();

        System.out.println("-------------------------> ESTOQUE DE ALIMENTOS <-----------------------------");
        EstoqueAlimento estoqueAlimento = (EstoqueAlimento) EstoqueFactory.getEstoque(TipoProduto.ALIMENTO);
        estoqueAlimento.addAll(produtos);
        estoqueAlimento.listar();
        estoqueAlimento.valorTotal();
        //Metódos proprios do "EstoqueAlimentos"
        estoqueAlimento.getPesoTotalAlimentos();
        estoqueAlimento.listarVencidos();

        System.out.println("-------------------------> ESTOQUE DE INFORMATICA <----------------------------");
        Estoque estoqueInformatica = EstoqueFactory.getEstoque(TipoProduto.INFORMATICA);
        estoqueInformatica.addAll(produtos);
        estoqueInformatica.listar();
        estoqueInformatica.valorTotal();
    }
}