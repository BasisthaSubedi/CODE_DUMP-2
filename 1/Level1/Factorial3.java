package Level1;
    import java.util.Scanner;
    public class Factorial3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
        scanner.close();
    }
}
