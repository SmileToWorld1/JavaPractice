package day_15_ForLoop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        scan.close();
        int result= 0;

        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i)>=48&&str.charAt(i)<=57){
              result += str.charAt(i)-48;
            }
        }
        System.out.println("result = " + result);


    }
}
