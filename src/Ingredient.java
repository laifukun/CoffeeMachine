public class Ingredient {
    private String name;
    private double unitPrice;

    public Ingredient(String _name, double _unitPrice) {
        name = _name;
        unitPrice = _unitPrice;
    }

    public void changeUnitPrice(double newPrice) {
        unitPrice = newPrice;
    }

    public String getName() {
        return name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
}
