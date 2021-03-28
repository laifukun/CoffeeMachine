import java.util.HashMap;
import java.util.Map;

public class IngredientInventory {

    private Map<Ingredient, Integer> ingredientInventory;

    public IngredientInventory() {
        ingredientInventory = new HashMap<>();
    }

    public void loadIngredient(Ingredient ing, int amount) {
        ingredientInventory.put(ing,amount);
    }
    public boolean getIngredient(Ingredient ing, int amount) {
        if (ingredientInventory.getOrDefault(ing,0) < amount) {
            return false;
        }

        ingredientInventory.put(ing, ingredientInventory.get(ing) - amount);
        return true;
    }
    public static void main(String[] args) {

    }
}
