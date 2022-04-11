package day_13;

import java.util.Scanner;

public class StringEnter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word  = scan.nextLine();

        if (word.length()==0){
            System.out.println("String is empty");
        }else if (word.length()>3){
            System.out.print(word.charAt(word.length()-3));
            System.out.print(word.charAt(word.length()-2));
            System.out.print(word.charAt(word.length()-1));
        }else if (word.length()>0&&word.length()<=3){
            System.out.println(word);
        }
        scan.close();
    }
}
