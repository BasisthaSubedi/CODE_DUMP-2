package Level3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first = sc.nextDouble();
            System.out.print("Enter second number: ");
            double second = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.next();

            double result;
            switch (op) {
                case "+":
                    result = first + second;
                    break;
                case "-":
                    result = first - second;
                    break;
                case "*":
                    result = first * second;
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                    } else {
                        System.out.println("Cannot divide by zero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }
}