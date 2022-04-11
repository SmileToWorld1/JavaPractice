package day_15_ForLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        scan.close();
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        boolean palindrome = (str.equalsIgnoreCase(reverse))?true:false;
                        // Anna== annA ==> string should not be sensitive...
        System.out.println(palindrome);
    }
}
