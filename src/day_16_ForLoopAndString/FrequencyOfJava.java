package day_16_ForLoopAndString;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = scan.nextLine();
        scan.close();
        int result =0;

        for (int i = 0; i <= str.length()-4; i++) {

            if (str.substring(i,i+4).equalsIgnoreCase("java")){
                result++;
            }
        }
        System.out.println(result);
     /*   int firstLength = str.length();
        str = str.toLowerCase().replace("java","");
        int afterLength= str.length();

        int result = (firstLength-afterLength)/4;
        System.out.println(result);
     */
    }
}
