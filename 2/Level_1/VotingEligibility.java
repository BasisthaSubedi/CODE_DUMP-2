package Java_Array_Concepts.Level_1;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] ages = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }

            for (int age : ages) {
                if (age < 0) {
                    System.out.println("Invalid age entered.");
                } else if (age >= 18) {
                    System.out.println("The student with age " + age + " can vote.");
                } else {
                    System.out.println("The student with age " + age + " cannot vote.");
                }
            }
        }
    }
}