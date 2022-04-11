package day_16_ForLoopAndString;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scan.nextLine();
        System.out.println("Enter a char:");
        String ch = scan.next();
        int howMany= 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)+"").equalsIgnoreCase(ch)){
                howMany += 1;
            }

        }
        System.out.println(howMany);
        scan.close();
    }
}
