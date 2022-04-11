package day_12;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String productName = scan.nextLine();

        System.out.println("Enter the price:");
        double price = scan.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = scan.nextInt();

        System.out.println("Enter their fist name:");
        String firstName = scan.next();

        System.out.println(firstName+", your order for "+quantity+" "+productName+
                " has been places. Your total is "+(price*quantity)+".");

        scan.close();
    }
}
