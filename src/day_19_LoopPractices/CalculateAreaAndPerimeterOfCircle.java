package day_19_LoopPractices;

import java.util.Scanner;

public class CalculateAreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ans = "";

        do {
            System.out.println("Enter the radius of the circle:");
            double rad = scan.nextDouble();

            if (rad <= 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            double diameter = 2 * rad;
            double area = 3.14 * rad*rad;
            double perimeter = 3.14 * diameter;

            System.out.println("1. Diameter of circle: " + diameter +
                    "\n2. Area of circle: " + area +
                    "\n3. Perimeter of circle: " + perimeter);

            System.out.println( "Would you like to calculate another circle?");
            ans = scan.next().toLowerCase();
            while ( !(ans.equals("yes")||ans.equals("no")) ){
                System.err.println("Invalid answer, please re-enter valid answer: (yes/no)");
                ans = scan.next().toLowerCase();
            }
        }while (ans.equals("yes"));

        System.out.println("Thank you for using Cydeo Circle Calculator APP");

scan.close();
    }
}
