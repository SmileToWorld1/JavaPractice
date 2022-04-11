package day_13;

import java.util.Scanner;

public class CybertekApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = "Cydeo";
        String password = "WoodenSpoon";

        System.out.println("Enter your username:");
        String username1 = scan.nextLine();
        System.out.println("Enter your password:");
        String password1 = scan.nextLine();

        if (username.equals(username1)&&password.equals(password1)){
            System.out.println("Logged in.");
        }else{
            System.err.println("Incorrect username or password");
        }
        scan.close();
    }
}
