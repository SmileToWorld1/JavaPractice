package day_19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter your score:");
            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.err.println("Invalid Entry");
                System.exit(0);
                scan.close();
            }

            System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" :
                    (score >= 60) ? "D" : "F");

            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
                scan.close();
            }
            if (answer.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }

        }while (true);
scan.close();

    }
}
