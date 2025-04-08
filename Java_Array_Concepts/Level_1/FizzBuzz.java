package Java_Array_Concepts.Level_1;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Position " + i + " = " +
                    (i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : i));
            }
        }
    }
}