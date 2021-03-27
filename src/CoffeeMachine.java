import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {

    private Map<String, Integer> IngredientInventory;
    private Map<String, Double> IngredientPrice;
    private Map<String, Recipe> Coffees;
    private int numberOfOutlet;

    public CoffeeMachine(int N) {
        numberOfOutlet = N;
        IngredientInventory = new HashMap<>();
        IngredientPrice = new HashMap<>();
    }

    public void createRecipe(String coffeeType) {

    }
    public void fillInventory(String ingredient, int quantity) {
        IngredientInventory.put(ingredient, IngredientInventory.getOrDefault(ingredient,0)+quantity);
    }

    public static void main(String[] args) {

    }
}
