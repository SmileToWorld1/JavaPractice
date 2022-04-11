package day_14;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if (word.charAt(0)>47&&word.charAt(0)<58){
            System.out.println("first character is digit");
        }else if (word.charAt(0)>64&&word.charAt(0)<91){
            System.out.println("first character is uppercase letter");
        }else if (word.charAt(0)>96&&word.charAt(0)<123){
            System.out.println("first character is lowercase letter");
        }else {
            System.out.println("first character is special character");
        }
        /*
          if(firstChar >= '0' && firstChar <= '9'){
            result = "first character is digit";
        }else if(firstChar >= 'a' && firstChar <= 'z'){
            result = "first character is lowercase letter";
        }else if(firstChar >= 'A' && firstChar<= 'Z'){
            result = "first character is uppercase letter";
        }else{
            result = "first character is special character";
        }
         */
        scan.close();
    }
}
