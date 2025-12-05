public class Plant {
    protected double price;
    protected boolean flowers;
    protected String name;

    public Plant(String name, double price, boolean flowers) {
        this.name = name;
        this.price = price;
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        if (flowers) { // For plants with a member variable indicating they produce flowers
            return "This plant is called a \"" + name + "\", costs $" + price + " and does produce flowers";
        }
        // False case
        return "This plant is called a \"" + name + "\", costs $" + price + " and does NOT produce flowers";
    }

    public void printBill(int plantsToOrder) {

    }
}
