public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine(3);
        Ingredient water= new Ingredient("Water", 0.0);
        Ingredient espresso = new Ingredient("Espresso", 0.5);
        Ingredient milk = new Ingredient("Milk", 1.5);
        Ingredient cream = new Ingredient("Cream", 1.0);
        Ingredient coffee = new Ingredient("Coffee", 2.0);
        Ingredient foam = new Ingredient("Foam", 2.0);

        cm.fillInventory(water, 200);
        cm.fillInventory(espresso, 20);
        cm.fillInventory(milk, 30);
        cm.fillInventory(cream, 50);
        cm.fillInventory(foam, 80);
        cm.fillInventory(coffee, 80);

        int cupSize = 10;

        Recipe blackRecipe = new Recipe();
        blackRecipe.addIngredient(coffee, 8);
        cm.setCoffeeRecipe("Black", blackRecipe);

        Recipe latteRecipe = new Recipe();
        latteRecipe.addIngredient(espresso, 7);
        latteRecipe.addIngredient(milk, 1);
        cm.setCoffeeRecipe("Latte", latteRecipe);

        Recipe cappuccinoRecipe = new Recipe();
        cappuccinoRecipe.addIngredient(espresso, 6);
        cappuccinoRecipe.addIngredient(milk, 1);
        cappuccinoRecipe.addIngredient(foam, 1);
        cm.setCoffeeRecipe("Cappuccino", cappuccinoRecipe);

        for (int i = 0; i < 100; i++) {
            cm.getCoffee("Cappuccino",1);
        }


    }
}
