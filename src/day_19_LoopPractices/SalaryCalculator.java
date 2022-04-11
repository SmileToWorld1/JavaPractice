package day_19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("How much make an hour?");
            int hourlyRate = scan.nextInt();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            System.err.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
            if (weeklyHour < 1 || weeklyHour > 66) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double taxRate = scan.nextDouble();
            if (taxRate < 0 || taxRate > 0.1) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            System.out.println("1. Gross Salary: " + (weeklyHour * hourlyRate) +
                    "\n2. Federal Tax: " + (weeklyHour * hourlyRate) * 0.26 +
                    "\n3. State Tax: " + ((weeklyHour * hourlyRate) * taxRate) +
                    "\n4. Total Tax: " + (((weeklyHour * hourlyRate) * 0.26) + ((weeklyHour * hourlyRate) * taxRate)) +
                    "\n5. Net Income: " + ((weeklyHour * hourlyRate) - (((weeklyHour * hourlyRate) * 0.26) + ((weeklyHour * hourlyRate) * taxRate))));
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
                scan.close();
            }
            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }while (true);

        scan.close();

    }
}
