package day_13;

import java.util.Scanner;

public class CalledTravel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Have you a valid passport?");
        String validPassport = scan.next();


        if (validPassport.equals("yes")){
            int costTicket = 1000;
            System.out.println("Which country do you travel to?");
            scan.nextLine();
            String country = scan.nextLine();
            System.out.println("How many bags will you take?");
            byte bag = scan.nextByte();
            costTicket += bag*50;

            System.out.println("How many people will travel with you?");
            short people = scan.nextShort();

            costTicket = (people<=3)? costTicket - people*100 : costTicket - 300;

            System.out.println("Enter the name of the people:");
            scan.nextLine();
            String names = scan.nextLine();

            System.out.println("Your ticket is booked to " + country + ". We have charged extra for the " +
                    bag + " bags but you are travelling with " + names + " so we are giving a discount. " +
                    "Your total cost is " + costTicket + "$");
        }else if (validPassport.equals("no")){

            int costPassport = 200;

            System.out.println("When did your passport expire?");
            int year = scan.nextInt();
            costPassport += (2022 - year )*75;

            System.out.println("Which country do you plan to travel?");
            scan.nextLine();
            String country = scan.nextLine();

            System.out.println("Will you travel in the next year?");
            String nextYear = scan.next();

            String result = "Looks like your password has been expired for " + (2022 - year) +
                    ", but not to worry we will get it ready for you to travel to " +
                    country + ". Your total cost has come out to ";

            if (nextYear.equals("yes")) {
                costPassport += 100;
                result += costPassport +".";
            }else if (nextYear.equals("no")){
                costPassport -= 50;
                result += costPassport +".";
            }else {
                result = "Invalid input";
            }

            System.out.println(result);

        }else {
            System.out.println("Invalid input");
        }
        scan.close();
    }
}