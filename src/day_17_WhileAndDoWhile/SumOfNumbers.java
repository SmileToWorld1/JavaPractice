package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sumOfNumbers = 0;

        while (true){
            System.out.println("Enter a number:");
            int num = new Scanner(System.in).nextInt();
            if (num<0){
                break;
            }
            sumOfNumbers += num;
        }
        System.out.println("sumOfNumbers = " + sumOfNumbers);
    }
}
