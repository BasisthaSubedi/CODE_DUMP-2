package Level3;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks in Physics: ");
            int physics = sc.nextInt();
            System.out.print("Enter marks in Chemistry: ");
            int chemistry = sc.nextInt();
            System.out.print("Enter marks in Maths: ");
            int maths = sc.nextInt();

            int totalMarks = physics + chemistry + maths;
            double average = totalMarks / 3.0;
            double percentage = (totalMarks / 300.0) * 100;

            String grade;
            String remarks;

            if (percentage >= 90) {
                grade = "A+";
                remarks = "Excellent";
            } else if (percentage >= 80) {
                grade = "A";
                remarks = "Very Good";
            } else if (percentage >= 70) {
                grade = "B";
                remarks = "Good";
            } else if (percentage >= 60) {
                grade = "C";
                remarks = "Fair";
            } else if (percentage >= 50) {
                grade = "D";
                remarks = "Pass";
            } else {
                grade = "F";
                remarks = "Fail";
            }

            System.out.println("Average Marks: " + average);
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
    }
}