package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class WithoutDivisionAndMultiplication {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Please enter a second number:");
        int num2 = new Scanner(System.in).nextInt();

        int division = 0;
        int multiplication = 0;

        if (num1 > 0 && num2 > 0) {
            for (int i = num1; i < num1 + num2; i++) {
                multiplication += num1;
            }
            while ((num1 - num2) >= 0) {
                division++;
                num1 = num1 - num2;
            }
        } else {
            System.out.println("Please just enter positive numbers:");
        }
        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiplication);
    }
}
