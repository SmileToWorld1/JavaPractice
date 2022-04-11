package day_18_NestedLoop;

import java.util.Scanner;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        System.out.println("Enter a string:");
        String str = new Scanner(System.in).next();
        String result = "";

        while (str.length() > 0) {
           if (str.substring(1).contains(str.substring(0,1))) {
             str =  str.replace(str.charAt(0) + "", "");
           }else{
               result += str.substring(0,1);
               str =  str.replace(str.charAt(0) + "", "");
           }
        }
        System.out.println(result);
    }
}
