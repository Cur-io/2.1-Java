// ProductDiscount.java Question 3
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Apply discount
    public void applyDiscount(double percentage) {
        price = price - (price * (percentage / 100));
    }

    // Getter
    public double getPrice() {
        return price;
    }
}

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create product
        Product product = new Product("Laptop", 1200.00);

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        product.applyDiscount(discount);

        System.out.println("New price after discount: $" + product.getPrice());
    }
}
