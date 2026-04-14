import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {x

        Scanner sc = new Scanner(System.in);
        ArrayList<String> student = new ArrayList<>();

        System.out.println("Enter Student Details:");

        System.out.print("Enter Name: ");
        student.add(sc.nextLine());

        System.out.print("Enter Class: ");
        student.add(sc.nextLine());

        System.out.print("Enter Roll No: ");
        student.add(sc.nextLine());

        System.out.print("Enter Course: ");
        student.add(sc.nextLine());

        System.out.print("Enter College: ");
        student.add(sc.nextLine());

        System.out.println("\n---------------------------------------------");
        System.out.println("| Field        | Details                    |");
        System.out.println("---------------------------------------------");

        String[] fields = {"Name", "Class", "Roll No", "Course", "College"};

        for (int i = 0; i < student.size(); i++) {
            System.out.printf("| %-12s | %-25s |\n", fields[i], student.get(i));
        }

        System.out.println("---------------------------------------------");

        sc.close();
    }
}
