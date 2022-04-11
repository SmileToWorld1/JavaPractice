package day_14;

import java.util.Locale;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.nextLine();
        scan.close();

        String firstname = email.substring(0,email.indexOf("_"));
        firstname = (firstname.toUpperCase()).charAt(0) + firstname.substring(1).toLowerCase();

        String surname = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        surname = (surname.toUpperCase()).charAt(0) + surname.substring(1).toLowerCase();

        String domain =email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("First name: "+firstname+"\nLast name: "+surname+"\nDomain: "+domain);
        scan.close();
    }
}
