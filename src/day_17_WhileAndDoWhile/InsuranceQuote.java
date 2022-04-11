package day_17_WhileAndDoWhile;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your gender:");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("female")||gender.equals("male"))){
            System.out.println("Invalid entry, please re-enter your gender:");
             gender = scan.next().toLowerCase();
        }
        System.out.println("Are you married(Yes/No)");
        String isMarried = scan.next().toLowerCase();
        while (!(isMarried.equals("yes")||isMarried.equals("no"))){
            System.out.println("Invalid entry, please re-enter valid entry:");
            isMarried = scan.next().toLowerCase();
        }
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        while (age<0||age>120){
            System.out.println("Invalid entry, please re-enter valid entry:");
            age = scan.nextInt();
        }
        System.out.println("how many miles do you drives in a day");
        int miles = scan.nextInt();
        while (miles<5){
            System.out.println("Invalid entry, please re-enter valid entry:");
            miles = scan.nextInt();
        }
        System.out.println("Which one do you prefer: full coverage or liability insurance?");
        scan.nextLine();
        String prefer = scan.nextLine().toLowerCase();
        while (!(prefer.equals("full coverage")||prefer.equals("liability insurance"))){
            System.out.println("Invalid entry, please re-enter valid entry:");
            prefer = scan.nextLine().toLowerCase();
        }
        System.out.println("Have you had any accidents or claims in past 5 years? (Yes/No)");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes")||accident.equals("no"))){
            System.out.println("Invalid entry, please re-enter valid entry:");
            accident = scan.next().toLowerCase();
        }
        System.out.println("Does your car has an anti-theft device? (Yes/No)");
        String antiTheft= scan.next().toLowerCase();
        while (!(antiTheft.equals("yes")||antiTheft.equals("no"))){
            System.out.println("Invalid entry, please re-enter valid entry:");
            antiTheft = scan.next().toLowerCase();
        }
        int price = 0;
        if (prefer.equals("liability")){

           if (age<25){ price = 90;
           }else{ price = 50;}
           if (miles<=10){ price += 10;
           }else if (miles<=50){ price += 30;
           }else { price += 50; }
       } else {
            if (age<25){ price = 160;
            }else{ price = 120; }
            if (miles<=10){ price += 20;
            }else if (miles<=50){ price += 40;
            }else { price += 70; }
            if (antiTheft.equals("yes")){ price -= price*0.05; }
            if (accident.equals("yes")){ price += price*0.15;
            }else{ price -= price*0.10; }
            if (isMarried.equals("yes")){ price -= price*0.05; }

            System.out.println("name = " + name);
            System.out.println("gender = " + gender);
            System.out.println("isMarried = " + isMarried);
            System.out.println("age = " + age);
            System.out.println("prefer = " + prefer);
            System.out.println("antiTheft = " + antiTheft);
            System.out.println("accident = " + accident);
            System.out.println("Insurance Quote is: "+price+"$");
            scan.close();
        }
    }
}
