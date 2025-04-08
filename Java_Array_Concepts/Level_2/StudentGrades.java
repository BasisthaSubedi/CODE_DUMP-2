package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] physics = new int[numStudents];
        int[] chemistry = new int[numStudents];
        int[] maths = new int[numStudents];
        double[] percentages = new double[numStudents];
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            physics[i] = getValidMarks(scanner, "Physics");
            chemistry[i] = getValidMarks(scanner, "Chemistry");
            maths[i] = getValidMarks(scanner, "Maths");

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = getGrade(percentages[i]);
        }

        System.out.println("\nStudent Report:");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s%n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s%n", physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }

    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        while (true) {
            System.out.println("Enter " + subject + " marks (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) break;
            else System.out.println("Invalid marks! Enter a value between 0 and 100.");
        }
        return marks;
    }

    private static String getGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "F";
    }
}
