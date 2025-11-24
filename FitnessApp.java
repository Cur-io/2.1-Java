// FitnessApp.java Question 2
import java.util.Scanner;

public class FitnessApp {

    // Method to get fitness level
    public static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = sc.nextInt();

        String level = getFitnessLevel(steps);
        System.out.println("Your fitness level: " + level);
    }
}
