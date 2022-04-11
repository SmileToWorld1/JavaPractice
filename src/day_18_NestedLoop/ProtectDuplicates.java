package day_18_NestedLoop;

import java.util.Scanner;

public class ProtectDuplicates {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.next();
        String result = "";

        while (str.length()>0) {
            result = "" + str.charAt(0);
            System.out.print(result);
            str = str.replace(("" + str.charAt(0)), "");

        }
    scan.close();

    }
}

