package day_14;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an account number");
        String accountNum = scan.nextLine();

        if (accountNum.charAt(0)=='2'&&(accountNum.length())==7||
                accountNum.charAt(0)=='5'&&(accountNum.length())==10){
            System.out.println("Valid account number");
        }else {
            System.out.println("Invalid account number");
        }
        scan.close();
    }
}
