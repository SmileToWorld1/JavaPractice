package day_13;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String word = scan.next();
        char midChar= word.charAt(1);

        if (word.length()==3){
            switch (midChar){
                case 'a':
                    System.out.println("Cool word");
                    break;
                default:
                    System.out.println("Okay word");
            }
        }else if (word.length()<3){
            System.out.println("Word is too short");
        }else if (word.length()>3){
            System.out.println("Word is too long");
        }
        scan.close();
    }
}
