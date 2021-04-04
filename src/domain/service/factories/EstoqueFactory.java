package domain.service.factories;
import domain.service.Estoque;
import domain.service.EstoqueAlimento;
import domain.service.EstoqueCosmetico;
import domain.service.EstoqueInformatica;
import domain.service.factories.enums.TipoProduto;

//Essa é a classe do Factory Method
public class EstoqueFactory {
    //FACTORY METHOD: Esse é o método reponsavel por decidir qual implementação (classe) de estoque será gerado
    //Obs: Esse método é static, portanto não é preciso instancia sua classe na chamada
    public static Estoque getEstoque(TipoProduto tipo){
        //Aplica uma condicional "switch", (obs: só ira retornar uma das três opções)
        return switch(tipo) {
            //Se o tipo for "ALIMENTO" retorna o estoque responsavel por gerênciar os produtos da catégoria Alimento
            case ALIMENTO -> new EstoqueAlimento();
            case COSMETICO -> new EstoqueCosmetico();
            case INFORMATICA -> new EstoqueInformatica();
        };
    }
}
