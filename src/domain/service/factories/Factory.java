package domain.service.factories;
import domain.model.*;
import domain.service.*;
import domain.service.factories.enums.TipoNegocio;

//Essa é a classe do Factory Method
public class Factory {
    //FACTORY METHOD - Estoque: Esse é o método reponsavel por decidir qual implementação de "Estoque" será gerado
    //Obs: Esse método é static, portanto não é preciso instanciar sua classe para chamá-lo
    public static Estoque getEstoque(TipoNegocio tipo){
        //Aplica uma condicional "switch", (obs: só ira retornar uma das três opções)
        return switch(tipo) {
            //Por exemplo, se o tipo for "ALIMENTO" retorna o estoque responsavel Alimentos
            case ALIMENTO -> new EstoqueAlimento();
            case COSMETICO -> new EstoqueCosmetico();
            case INFORMATICA -> new EstoqueInformatica();
        };
    }
    //FACTORY METHOD - Produto 1: Método reponsavel por decidir qual implementação (classe) de "Produto" será gerado
    public static Produto getProduto(TipoNegocio tipo){
        return switch(tipo) {
            case ALIMENTO -> new Alimento();
            case COSMETICO -> new Cosmetico();
            case INFORMATICA -> new Informatica();
        };
    }
}








