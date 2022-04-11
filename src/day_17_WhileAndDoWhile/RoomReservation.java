package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        System.out.println("Would you want to reserve a room:");
        String answer = new Scanner(System.in).next().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid answer, please re-enter answer:");
            answer = new Scanner(System.in).next().toLowerCase();
        }
        if (answer.equals("no")){
            System.out.println("Have a nice day");

        }else {
            System.out.println("Which type of room do you wants to reserve?");
            String room = new Scanner(System.in).nextLine().toLowerCase();
             while (!(room.equals("king bed")||room.equals("queen bed")||room.equals("single bed"))){
                 System.err.println("Invalid room, please re-enter type of room:");
                 room = new Scanner(System.in).nextLine().toLowerCase();
            }
            System.out.println( room.equals("king bed")? "King Bed ==> 120$" : (room.equals("queen bed"))?
                    "Queen Bed ==> 100$" : "single Bed ==> 80$" );
        }
    }
}
