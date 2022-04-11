package day_12;

import java.util.Scanner;

public class LiveWithToGather {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        String result = "";

        switch (people){
            case 1: case 2:
                result = "Live with less than 3 people";
                break;
            case 3: case 4: case 5: case 6:
                result= "Live with 3 - 6 people";
                break;
            default: result ="Live with more than 6 people";
        }
        System.out.println(result);


        input.close();
    }
}
