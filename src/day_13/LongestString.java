package day_13;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two sentence");
        String sentence1 = scan.nextLine();
        String sentence2 = scan.nextLine();

        int length1 = sentence1.length();
        int length2 = sentence2.length();

        if(length1>length2){
            System.out.println("Longer sentence is: "+sentence1);
        }else if (length2>length1){
            System.out.println("Longer sentence is: "+sentence2);
        }else{
            System.out.println("Equal of characters sentences");
        }
        scan.close();
    }
}
