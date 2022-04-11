package day_13;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = scan.next();
        System.out.println("Enter second word:");
        String word2 = scan.next();
        System.out.println("Enter third word:");
        String word3 = scan.next();

        if(word1.length()==word2.length() && word1.length()==word3.length()){
            System.out.println("All words are same length");
        }else if (word1.length()==word2.length()&&word1.length()!=word3.length()||
                word1.length()==word3.length()&&word1.length()!=word2.length()||
                word3.length()==word2.length()&&word1.length()!=word3.length()){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }
        scan.close();
    }
}
