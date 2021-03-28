import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoffeeMachine {


    private IngredientInventory ingInventory;
    private Map<String, Recipe> coffeeRecipe;
    private Mixer mixer;
    private int numberOfOutlet;

    public CoffeeMachine(int N) {
        numberOfOutlet = N;
        ingInventory = new IngredientInventory();
        coffeeRecipe = new HashMap<>();
        mixer = new Mixer();
    }

    public void fillInventory(Ingredient ing, int quantity) {
        ingInventory.loadIngredient(ing, quantity);
    }

    public void setCoffeeRecipe(String coffeeName, Recipe recipe) {
        coffeeRecipe.put(coffeeName, recipe);
    }

    public boolean loadIngredients(String coffeeName) {
        Recipe rp = coffeeRecipe.get(coffeeName);
        for (Iterator<Map.Entry<Ingredient, Integer>> it = rp.iterator(); it.hasNext(); ) {
            Map.Entry<Ingredient, Integer> entry = it.next();
            Ingredient ing = entry.getKey();
            int quantity = entry.getValue();

            if (!ingInventory.getIngredient(ing, quantity) ){
                System.out.println(ing.getName() + " is in short");
                return false;
            }

        }
        return true;
    }

    public boolean getCoffee(String coffeeName, int outlet) {

        if (outlet < 0 || outlet > numberOfOutlet - 1 ) {
            System.out.println("Wrong Outlet!");
        }
        if (!coffeeRecipe.containsKey(coffeeName)) {
            System.out.println("No such Coffee");
            return false;
        }

        if (!loadIngredients(coffeeName)) {
            System.out.println("In short of ingredient!");
            return false;
        }

        if (!mixer.process(1)) {
            return false;
        }

        System.out.println("Outlet " + outlet + " with " + coffeeName + ":");
        return brew(outlet);
    }

    public boolean brew(int outlet) {
        System.out.println("Brewing....");
        return true;
    }
    public static void main(String[] args) {

    }
}
