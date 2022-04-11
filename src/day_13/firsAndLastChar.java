package day_13;

import java.util.Scanner;

public class firsAndLastChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = scan.nextLine();

        char firstChar= word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        if (firstChar == lastChar){
            System.out.println("Same");
        }else {
            System.out.println("Different");
        }
        scan.close();
    }
}
