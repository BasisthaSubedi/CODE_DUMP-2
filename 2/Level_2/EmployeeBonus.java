package Java_Array_Concepts.Level_2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 10;
        
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] bonuses = new double[numEmployees];
        double[] newSalaries = new double[numEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = scanner.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                continue;
            }

            salaries[i] = salary;
            yearsOfService[i] = years;
        }

       
        for (int i = 0; i < numEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

       
        System.out.println("\nTotal Bonus Payout: $" + totalBonus);
        System.out.println("Total Old Salary: $" + totalOldSalary);
        System.out.println("Total New Salary: $" + totalNewSalary);
        
        scanner.close();
    }
}

