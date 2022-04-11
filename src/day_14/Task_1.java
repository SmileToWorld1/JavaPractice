package day_14;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1= scan.next();
        System.out.println("Enter second word:");
        String word2= scan.next();

        System.out.println(word1.substring(1)+word2.substring(1));
        scan.close();
    }
}
