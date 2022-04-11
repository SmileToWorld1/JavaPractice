package day_13;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);
        System.out.println("Split or No split (Yes or No)?");
        String split = input.next();
        System.out.println("Enter the number of people:");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount:");
        double amount = input.nextDouble();
        System.out.println("Service Quality:");
        String quality = input.next();

        double totalTip = 0;

        switch (quality) {
            case "Poor":
                totalTip = amount * 0.05; break;
            case "Fair":
                totalTip = amount * 0.10; break;
            case "Good":
                totalTip = amount * 0.15; break;
            case "Great":
                totalTip = amount * 0.20; break;
            case "Excellent":
                totalTip = amount * 0.25; break;
        }

        double totalToPay = amount + totalTip;
        double totalPerPerson = totalToPay / numberOfPeople;
        double tipPerPerson = totalTip / numberOfPeople;

        if (split.equals("Yes")){
            System.out.println("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalToPay +
                    "\nTotal tip: " + totalTip + "\nTotal per person: " + totalPerPerson + "\nTip per person: " + tipPerPerson);
        }else{
            System.out.println("Number of people entered: " + numberOfPeople + "\nTotal to pay: " + totalToPay +
                    "\n(Total tip: " + totalTip+ " + Amount: "+amount+")");
        }
        input.close();
    }
}