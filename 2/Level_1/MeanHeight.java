package Java_Array_Concepts.Level_1;
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] heights = new double[11];
            double sum = 0.0;

            for (int i = 0; i < 11; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = scanner.nextDouble();
                sum += heights[i];
            }

            double mean = sum / 11;
            System.out.println("Mean height of football team: " + mean);
        }
    }
}