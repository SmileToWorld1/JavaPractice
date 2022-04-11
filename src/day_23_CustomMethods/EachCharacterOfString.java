package day_23_CustomMethods;

public class EachCharacterOfString {
    public static void main(String[] args) {

        printEachChar("Ali ata bak");


    }

    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }



}

