package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3];
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            while (true) {
                System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();

                System.out.println("Enter height (m) for person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();

                if (personData[i][0] > 0 && personData[i][1] > 0) break;
                else System.out.println("Invalid input! Enter positive values.");
            }

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 24.9) weightStatus[i] = "Normal weight";
            else if (personData[i][2] < 29.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(m)", "BMI", "Status");

        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
