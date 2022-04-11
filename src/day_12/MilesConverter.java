package day_12;

import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter miles:");
        double miles = scan.nextDouble();
        double kilometers = miles*1.609;
        System.out.println(miles+" miles equal to "+kilometers+" kilometers");

        scan.close();
    }
}
