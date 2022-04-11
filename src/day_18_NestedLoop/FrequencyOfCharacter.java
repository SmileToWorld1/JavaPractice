package day_18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("type the text which you want to find frequency of letters");
        String text = input.nextLine();
        String result = "";
        int count = 0;

        for (int i = 0; i < text.length(); ) {
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }
            result = "" + text.charAt(i) + count;
            text = text.replaceAll(("" + text.charAt(i)), "") ;
            System.out.print(result);
            count =0;
        }
        input.close();
    }
}
