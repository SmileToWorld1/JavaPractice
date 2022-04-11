package day_16_ForLoopAndString;

import java.util.Scanner;

public class PozitiveNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if (number>0){
                positive += 1;
            }else if (number<0){
                negative += 1;
            }

        }
        System.out.println(positive+" positive and "+negative+" negative");
        scan.close();

    }
}
