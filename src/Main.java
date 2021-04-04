import domain.Estoque;
import domain.EstoqueCosmetico;
import domain.model.Cosmetico;
import domain.model.Informatica;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new EstoqueCosmetico();
        estoque.add(new Cosmetico(12, "Shampoo", 5, 45.0));
        estoque.listar();
    }
}
