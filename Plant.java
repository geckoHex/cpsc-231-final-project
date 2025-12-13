import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Plant {
    protected double price;
    protected boolean flowers;
    protected String name;

    public Plant() {
        this.name = "Unknown";
        this.flowers = false;
        this.price = 0.00;
    }

    public Plant(double price, boolean flowers, String name) {
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
        try {
            PrintWriter outputFileWriter = new PrintWriter("receipt.txt");

            // Header
            outputFileWriter.println("**** Receipt from The Plant Store ****\n");

            // Print items ordered
            for (int i=0; i<plantsToOrder; i++) {
                outputFileWriter.println(i+1 + ") " + name + " -------- $" + price); // Print each item and price for the amount ordered, indexed starting at 1
            }
            outputFileWriter.println(); // Blank line

            // Calculate totals
            double subTotal = price * plantsToOrder; // TODO: Round to two digits
            double taxCost = subTotal * 0.0775; // 7.75% tax rate in Orange, CA
            double finalPrice = subTotal + taxCost; // TODO: Round to two digits

            // Add finals to the receipt
            outputFileWriter.println(); // New line
            outputFileWriter.println("Sub-total: $" + subTotal);
            outputFileWriter.println("Tax:       $" + taxCost);
            outputFileWriter.println("----");
            outputFileWriter.println("Final total: $" + finalPrice);
            outputFileWriter.println();

            // Add cute message
            outputFileWriter.println("Thank you, come again!");


            // Save and close the file
            outputFileWriter.close();
        } catch (FileNotFoundException e) {
            // This code is unreachable because the JVM will create the file if it
            // doesn't exists. However, the compiler forces us to handle this error,
            // so this try-catch is merely a mandated formality here.
        }

    }
}
