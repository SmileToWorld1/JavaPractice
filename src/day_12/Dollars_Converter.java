package day_12;

import java.util.Scanner;

public class Dollars_Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centsReminder = 0;

        System.out.println("Enter cents:");
        int cents = scan.nextInt();

        int dollars = cents/100;
        centsReminder = cents%100;

        System.out.println(cents+" cents equal to: "+dollars+" dollars and "+centsReminder+" cents");

        scan.close();
    }
}
