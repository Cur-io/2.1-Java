// CoffeeOrderMain.java Question 3
class CoffeeOrder {
    String size;
    double price;

    // Constructor
    public CoffeeOrder(String size, double price) {
        this.size = size;
        this.price = price;
    }
}

public class CoffeeOrderMain {
    public static void main(String[] args) {
        // Creating two coffee orders
        CoffeeOrder order1 = new CoffeeOrder("Large", 4.50);
        CoffeeOrder order2 = new CoffeeOrder("Medium", 3.75);

        // Displaying orders
        System.out.println("Order 1: Size = " + order1.size + ", Price = $" + order1.price);
        System.out.println("Order 2: Size = " + order2.size + ", Price = $" + order2.price);
    }
}
