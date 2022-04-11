package day_13;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word which is only 5 characters long:");
        String word = scan.next();
        String result = ""+word.charAt(4)+word.charAt(3)+word.charAt(2)+word.charAt(1)+
                word.charAt(0);
        if (word.length()<5){
            System.out.println("Too short!");
        }else if (word.length()>5){
            System.out.println("Too long!");
        }else{
            System.out.println("reverse this word: "+result);
        }
      scan.close();
    }
}
