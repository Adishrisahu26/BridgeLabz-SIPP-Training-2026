import java.util.Scanner;

public class kingdom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTaxCollected = 0;

        // Read incomes and calculate tax
        for (int i = 0; i < incomes.length; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = input.nextDouble();

            double tax;
            String bracket;

            if (incomes[i] < 10000) {
                tax = incomes[i] * 0.05;
                bracket = "5% Tax Bracket";
            } else if (incomes[i] <= 50000) {
                tax = incomes[i] * 0.15;
                bracket = "15% Tax Bracket";
            } else {
                tax = incomes[i] * 0.30;
                bracket = "30% Tax Bracket";
            }

            System.out.println("Income: " + incomes[i]);
            System.out.println("Tax Bracket: " + bracket);
            System.out.println("Tax Amount: " + tax);
            System.out.println();

            totalTaxCollected += tax;
        }

        System.out.println("Total Tax Collected = " + totalTaxCollected);

        input.close();
    }
}