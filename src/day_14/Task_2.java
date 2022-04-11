package day_14;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();

        if ((word.charAt(word.length()-1)+"").equals("y")&&
                (word.charAt(word.length()-2)+"").equals("l")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }
        scan.close();
    }
}
