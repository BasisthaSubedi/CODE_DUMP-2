package Level3;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int originalNumber = number;
            int sumOfCubes = 0;

            while (number > 0) {
                int digit = number % 10;
                sumOfCubes += Math.pow(digit, 3);
                number /= 10;
            }

            if (sumOfCubes == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong Number");
            } else {
                System.out.println(originalNumber + " is not an Armstrong Number");
            }
        }
    }
}