package day_14;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if ((word.charAt(0)+"").equals("x")){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        scan.close();
    }
}
