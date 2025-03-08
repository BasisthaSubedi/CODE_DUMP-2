package Level2;
import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightAmar = scanner.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = scanner.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = scanner.nextDouble();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar" : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";
        System.out.println("The youngest friend is: " + youngestFriend);

        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";
        System.out.println("The tallest friend is: " + tallestFriend);

        scanner.close();
    }
}