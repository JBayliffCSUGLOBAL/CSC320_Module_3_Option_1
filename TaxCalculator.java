import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter weekly income
        System.out.println("Enter your weekly income: ");
        double income = scanner.nextDouble();

        // Calculate tax withholding based on income
        double taxWithholding;
        if (income < 500) {
            taxWithholding = income * 0.10; // 10% tax rate
        } else if (income < 1500) {
            taxWithholding = income * 0.15; // 15% tax rate
        } else if (income < 2500) {
            taxWithholding = income * 0.20; // 20% tax rate
        } else {
            taxWithholding = income * 0.30; // 30% tax rate
        }

        // Calculate weekly average tax withholding
        double weeklyAverageTax = taxWithholding / 52;

        // Display the result
        System.out.println("Weekly average tax withholding: $" + weeklyAverageTax);

        scanner.close();
    }
}
