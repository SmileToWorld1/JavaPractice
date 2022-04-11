package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class TwoNumberAndOperator {
    public static void main(String[] args) {
        System.out.println("Enter a first number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter a second number:");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Enter a math operator:");
        String str = new Scanner(System.in).next();
        char operator = str.charAt(0);
        int result = 0;

        while (!(operator == '+'||operator=='-'||operator=='*'||operator=='/')){
            System.err.println("Invalid operator, please re-enter operator:");
            str = new Scanner(System.in).next();
        }
        switch (operator){
            case '+' : result= num1+num2; break;
            case '-' : result= num1-num2; break;
            case '*' : result= num1*num2; break;
            case '/' : result= num1/num2; break;
        }
        System.out.println("result = " + result);
    }
}
