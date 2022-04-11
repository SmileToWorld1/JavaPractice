package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class DivisibleByThreeFiveFifteen {
    public static void main(String[] args) {
        System.out.println("Please, enter a number:");
        int number = new Scanner(System.in).nextInt();
        String divisible15 = "";
        String divisible5 = "";
        String divisible3 = "";

            while (number <= 0) {
                System.out.println("Invalid number, please re-enter a number:");
                number = new Scanner(System.in).nextInt();
            }
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) {
                divisible15 += i + " ";
            } else if (i % 5 == 0) {
                divisible5 += i + " ";
            } else if (i % 3 == 0) {
                divisible3 += i + " ";
            }
        }
        System.out.println("Divisible By 15 " + divisible15 +
                "\nDivisible By 5 " + divisible5 +
                "\nDivisible By 3 " + divisible3);
    }
}
