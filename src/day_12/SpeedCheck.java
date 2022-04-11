package day_12;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int speedLimit = 70;
        System.out.println("Enter the current speed:");
        int currentSpeed = scan.nextInt();

        if (currentSpeed>speedLimit){
            System.out.println(" You're driving "+(currentSpeed-speedLimit)+ " mph over the limit. Slow down!");
        }
        scan.close();
    }
}
