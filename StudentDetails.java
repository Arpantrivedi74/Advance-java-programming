import java.util.ArrayList;

public class StudentDetails {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> student = new ArrayList<>();

        // Add 5 elements
        student.add("Name");
        student.add("Class");
        student.add("Roll No");
        student.add("Course");
        student.add("College");

        // Print in tabular form
        System.out.println("---------------------------------");
        System.out.println("STUDENT DETAILS");
        System.out.println("---------------------------------");

        for (String data : student) {
            System.out.printf("| %-10s |\n", data);
        }

        System.out.println("---------------------------------");
    }
}
