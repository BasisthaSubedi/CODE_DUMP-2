package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

       
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.println("Enter height (in cm) of " + friends[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

       
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

       
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

      
        System.out.println("\nThe youngest friend is " + friends[youngestIndex] + " (Age: " + ages[youngestIndex] + ").");
        System.out.println("The tallest friend is " + friends[tallestIndex] + " (Height: " + heights[tallestIndex] + " cm).");
        
        scanner.close();
    }
}
