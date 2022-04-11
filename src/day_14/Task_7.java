package day_14;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.nextLine();
        scan.close();

        String firstname = email.substring(0,email.indexOf("_"));
        String surname = email.substring(email.indexOf("_")+1,email.indexOf("@"));

        if ((email.charAt(email.indexOf("_"))+"").equals("_")){
            System.out.println(surname+"_"+firstname+email.substring(email.indexOf("@")));
        }else{
            System.out.println(email);
        }
        scan.close();
    }
}
