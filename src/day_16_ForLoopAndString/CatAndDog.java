package day_16_ForLoopAndString;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        scan.close();
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < sentence.length()-3; i++) {
            if (sentence.substring(i,i+2).equalsIgnoreCase("cat")){
                cat++;
            }else if (sentence.substring(i,i+2).equalsIgnoreCase("dog")){
                dog++;
            }
        }
        System.out.println( (cat==dog)?true:false  );

    }
}
