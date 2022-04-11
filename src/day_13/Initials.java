package day_13;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String word1= scan.next();
        String word2= scan.next();

        System.out.println(word1.toUpperCase().charAt(0)+"."+word2.toUpperCase().charAt(0));
        scan.close();
    }
}
