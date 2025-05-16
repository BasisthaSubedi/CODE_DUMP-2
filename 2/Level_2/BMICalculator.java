package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            System.out.println("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();

            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            if (bmiValues[i] < 18.5) weightStatus[i] = "Underweight";
            else if (bmiValues[i] < 24.9) weightStatus[i] = "Normal weight";
            else if (bmiValues[i] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", weights[i], heights[i], bmiValues[i], weightStatus[i]);
        }

        scanner.close();
    }
}
