import java.util.Scanner;
   public class CelciusToFahrenheit {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter temperature in Celsius: ");
       double celsius = scanner.nextDouble();
       double fahrenheit = (celsius * 9/5) + 32;
       System.out.println("The Celsius temperature is " + celsius + "°C, which is " + fahrenheit + "°F in Fahrenheit.");
       scanner.close();
   }
}
