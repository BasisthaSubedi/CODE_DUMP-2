import java.util.Scanner;
   public class Interest {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


       System.out.print("Enter the Principal amount (INR): ");
       double principal = scanner.nextDouble();
       System.out.print("Enter the Rate of Interest (%): ");
       double rate = scanner.nextDouble();
       System.out.print("Enter the Time (years): ");
       double time = scanner.nextDouble();


       double simpleInterest = (principal * rate * time) / 100;
       System.out.println("The Simple Interest is INR " + simpleInterest + " for Principal INR " + principal + ", Rate of Interest " + rate + "%, and Time " + time + " years.");
       scanner.close();
   }
}
