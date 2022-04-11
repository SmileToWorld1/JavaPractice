package day_14;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word:");
        String word1 = scan.next();
        System.out.println("Enter second word:");
        String word2 = scan.next();

        if ((word1.charAt(word1.length()-1)+"").equals(""+word2.charAt(0))){
            System.out.println(word1+word2.substring(1));
        }else{
            System.out.println(word1+word2);
        }
        scan.close();

    }
}
