package Level3;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height in cm: ");
            double height = sc.nextDouble();

            double heightInMeters = height / 100;
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            System.out.println("BMI: " + bmi);
            System.out.println("Status: " + status);
        }
    }
}