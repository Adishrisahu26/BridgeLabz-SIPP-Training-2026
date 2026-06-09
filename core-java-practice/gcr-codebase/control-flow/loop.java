/*A kingdom's tax system charges 5% for income <10K, 15% for 10K–
50K, 30% above 50K. Read a citizen's income, print tax bracket and
amount. Extend: loop over an array of 10 citizens and tally total tax
collected.*/
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income for citizen " + (i + 1) + ": ");
            double income = scanner.nextDouble();
            double tax = calculateTax(income);
            totalTax += tax;
            System.out.println("Tax for citizen " + (i + 1) + ": " + tax);
        }

        System.out.println("Total tax collected: " + totalTax);
        scanner.close();
    }

    public static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income < 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }
}