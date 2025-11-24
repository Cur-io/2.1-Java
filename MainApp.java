import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Create student object
        Student student = new Student(name, marks);

        // Calculate grade
        GradeCalculator gc = new GradeCalculator();
        String grade = gc.calculateGrade(marks);

        // Display results
        student.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
