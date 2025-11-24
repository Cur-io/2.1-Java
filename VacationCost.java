// VacationCost.java Question 1
public class VacationCost {

    // Method to calculate total vacation cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }

    public static void main(String[] args) {
        double accommodation = 850.50;
        double meals = 350.25;
        double activities = 250.00;

        double total = calculateTotalCost(accommodation, meals, activities);

        System.out.println("Total Vacation Cost: $" + total);
    }
}
