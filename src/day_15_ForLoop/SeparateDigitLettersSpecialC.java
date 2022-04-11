package day_15_ForLoop;

import java.util.Scanner;

public class SeparateDigitLettersSpecialC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        scan.close();
        String letter ="";
        String special ="";
        String digit = "";


        for (int i = 0 ; i <= str.length()-1 ; i++) {
            if (str.charAt(i)>='a'&&str.charAt(i)<='z'||
                    str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                letter += str.charAt(i);
            }else if (str.charAt(i)>=48&&str.charAt(i)<=57){
                digit += str.charAt(i);
            }else{
                special += str.charAt(i);
            }
        }
        System.out.println("letters: "+letter+"\ndigits: "+digit
                +"\nspecial chars: "+special);
    }
}
