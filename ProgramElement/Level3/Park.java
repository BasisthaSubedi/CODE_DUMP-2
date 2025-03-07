import java.util.Scanner;
   public class Park {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Enter side 1 of the triangular park (in meters): ");
       double side1 = scanner.nextDouble();
       System.out.print("Enter side 2 of the triangular park (in meters): ");
       double side2 = scanner.nextDouble();
       System.out.print("Enter side 3 of the triangular park (in meters): ");
       double side3 = scanner.nextDouble();
       double perimeter = side1 + side2 + side3;
       double rounds = 5000 / perimeter;
       System.out.println("The total number of rounds the athlete needs to complete is " + rounds);
       scanner.close();
   }
}

