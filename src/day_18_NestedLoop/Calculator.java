package day_18_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Please, enter a first number:");
            int num1= scan.nextInt();
            System.out.println("Please enter a math operator (+,-,/,*)");
            char op = scan.next().charAt(0);
            while( ! (op=='+' ||  op=='-' || op=='*' || op=='/'  ) ){
                System.err.println("Invalid entry, please re-enter operator (+,-,*,/): ");
                op = scan.next().charAt(0);
            }
            System.out.println("Please, enter a second number:");
            int num2 = scan.nextInt();
            System.out.println( op=='+' ? num1+num2 : op=='-' ? num1-num2 :
                    op=='*' ? num1*num2 : num1/num2);
            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.print("Invalid entry, please re-enter (Yes/No): ");
                answer = scan.next();
            }

        }while (answer.equals("yes"));

        System.out.println("Thanks for using Cydeo calculator!");
        scan.close();
    }
}
