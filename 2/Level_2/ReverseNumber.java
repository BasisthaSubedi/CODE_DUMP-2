package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int temp = number, count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        System.out.println("\nReversed Number:");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}