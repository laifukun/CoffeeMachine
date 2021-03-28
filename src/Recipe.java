import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Recipe {

    private Map<Ingredient, Integer> ingredientMap;
    public Recipe() {
        ingredientMap = new HashMap<>();
    }
    public void addIngredient(Ingredient ing, int amount) {
        ingredientMap.put(ing, amount);
    }
    public boolean changeIngredientDose(Ingredient ing, int amount) {
        if (!ingredientMap.containsKey(ing)) return false;
        ingredientMap.put(ing, amount);
        return true;
    }
    public void removeIngredient(Ingredient ing) {
       // if (ingredientMap.containsKey(ing))
            ingredientMap.remove(ing);
    }

    /* Iterator of Ingredient in Recipe */
    public Iterator<Map.Entry<Ingredient, Integer>> iterator() {
        return new RecipeIterator();
    }
    private class RecipeIterator implements Iterator<Map.Entry<Ingredient, Integer>> {
        private Iterator it = ingredientMap.entrySet().iterator();
        public boolean hasNext() { return it.hasNext(); }
        public Map.Entry<Ingredient, Integer> next() {
            return (Map.Entry<Ingredient, Integer>) it.next();
        }
    }
    public static void main(String[] args) {

    }
}
