package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int[] frequency = new int[10];

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        System.out.println("\nDigit Frequency Count:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
}


