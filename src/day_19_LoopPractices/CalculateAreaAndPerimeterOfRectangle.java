package day_19_LoopPractices;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter the length of the Rectangle:");
            double length = scan.nextDouble();

            if (length<=0){
                System.err.println("Invalid Entry for the length of the Rectangle:");
                System.exit(0);
                scan.close();
            }
            System.out.println("Enter the width of the Rectangle:");
            double width = scan.nextDouble();

            if (width<=0){
                System.err.println("Invalid Entry for the width of the Rectangle:");
                System.exit(0);
                scan.close();
            }

            System.out.println("1. Area of Rectangle: "+(length*width)+
                    "\n2. Perimeter of Rectangle: "+(length*2+width*2));

            System.out.println( "Would you like to calculate another Rectangle?");
            String ans = scan.next().toLowerCase();
            while ( !(ans.equals("yes")||ans.equals("no")) ){
                System.err.println("Invalid answer, please re-enter valid answer: (yes/no)");
                ans = scan.next().toLowerCase();
            }
            if (ans.equals("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                System.exit(0);
                scan.close();
            }
        }while (true);





    }
}
