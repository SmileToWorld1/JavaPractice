package day_16_ForLoopAndString;

import java.util.Scanner;

public class MultiplyWithoutMultiplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two positive number:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = 0;

        if (num1<=0||num2<=0){
            System.out.println("Invalid");
        }else {
            for (int i = num1; i>=1 ; i--) {
                result += num2;
                /*
                 for (int i = 1; i <= num2 ; i++) {
                result += num1;
            }
                 */
            }
        }
        System.out.println(result);
        scan.close();

    }
}
