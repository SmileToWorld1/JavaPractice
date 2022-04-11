package day_12;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalValue = 0;
        String nameOfCompany ="";

        System.out.println("How many total shares you have already?");
        int shares = scan.nextInt();
        if (shares<=0){
            System.out.println();
        }else {
            System.out.println("how much is your total value in the stock market?");
            totalValue = scan.nextDouble();
            scan.nextLine();
            System.out.println("enter the name of the company that you have the most shares in");
            nameOfCompany = scan.nextLine();
            System.out.println("Your total stock market holding is $"+(int)totalValue+ " which is made up of "+shares+" shares. "
                    + nameOfCompany+ " is your company holdings");
        }
        scan.close();
    }
}
