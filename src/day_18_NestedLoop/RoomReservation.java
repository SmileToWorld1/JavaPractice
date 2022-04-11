package day_18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int king   = 120, queen  = 100, single = 80;
        int price = 0, total = 0;

        while (true) {
            System.out.println("Which bedroom do you want to reserve");
            String reserve = scan.nextLine().toLowerCase();
            while (!(reserve.equals("king bed") || reserve.equals("queen bed") || reserve.equals("single bed"))) {
                System.err.println("Invalid entry, please re enter:");
                reserve = scan.nextLine().toLowerCase();
            }
            System.out.println("How many nights do you want staying ");
            int night = scan.nextInt();
            while (night <= 0) {
                System.err.println("Invalid entry, please re enter:");
                night = scan.nextInt();
            }
            price = ( (reserve.equals("king bed"))? 120 : (reserve.equals("queen bed"))? 100 : 80  ) * night;
            total += ( (reserve.equals("king bed"))? 120 : (reserve.equals("queen bed"))? 100 : 80  ) * night;
            System.out.println("Your reservation price is: "+price);
            System.out.println("would you like to reserve another room?");
            String extraRoom = scan.next().toLowerCase();
            while ( ! ( extraRoom.equals("yes") || extraRoom.equals("no")) ) {
                System.err.println("Invalid entry, please re enter:");
                extraRoom = scan.next().toLowerCase();
            }
            if (extraRoom.equals("no")){
                break;
            }
            scan.nextLine();
        }
        System.out.println("Your total reservation price is: "+ total+ "$");
    scan.close();
    }
}
