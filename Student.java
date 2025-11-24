public class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
