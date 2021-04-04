import domain.Estoque;
import domain.EstoqueCosmetico;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new EstoqueCosmetico();
        estoque.add(new Cosmetico(12, "Shampoo", 5, 45.0));
        estoque.listar();
    }
}
