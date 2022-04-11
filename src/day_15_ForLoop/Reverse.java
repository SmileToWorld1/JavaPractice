package day_15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);

       String reverse = "";
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("reverse = " + reverse);
        scan.close();
    }
}
/*
1. Write a program that can reverse any given string

			String str = "Java"; ==> avaJ
		 //			      0123
 */