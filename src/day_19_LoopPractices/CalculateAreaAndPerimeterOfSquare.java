package day_19_LoopPractices;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfSquare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
        System.out.println("Enter the side of the square:");
        double side = scan.nextDouble();

        if (side<=0){
            System.err.println("Invalid Entry for the side of the square");
            System.exit(0);
        }

        System.out.println("1. Area of square: "+(side*side)+
                "\n2. Perimeter of square: "+(side*4));
        System.out.println( "Would you like to calculate another Square?");
        String ans = scan.next().toLowerCase();
        while ( !(ans.equals("yes")||ans.equals("no")) ){
            System.err.println("Invalid answer, please re-enter valid answer: (yes/no)");
            ans = scan.next().toLowerCase();
        }
        if (ans.equals("no")) {
            System.out.println("Thank you for using Cydeo Square Calculator APP");
            System.exit(0);
            scan.close();
        }
    }while (true);


    }
}
