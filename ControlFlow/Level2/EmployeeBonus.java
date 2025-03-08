package Level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your salary: ");
    double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Your bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus for employees with 5 or fewer years of service.");
        }

        scanner.close();
    }
}