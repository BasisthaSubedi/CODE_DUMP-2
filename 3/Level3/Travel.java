import java.util.Scanner;


public class Travel {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Enter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter the departure city: ");
    String fromCity = scanner.nextLine();
    System.out.print("Enter the via city: ");
    String viaCity = scanner.nextLine();
    System.out.print("Enter the destination city: ");
    String toCity = scanner.nextLine();
    System.out.print("Enter the distance from departure city to via city in miles: ");
    double fromToVia = scanner.nextDouble();
    System.out.print("Enter the distance from via city to final destination in miles: ");
    double viaToFinalCity = scanner.nextDouble();
    double totalDistance = fromToVia + viaToFinalCity;
    System.out.println(name + " is traveling from " + fromCity + " to " + toCity + " via " + viaCity + ". The total distance is " + totalDistance + " miles.");
    scanner.close();
   }
}
