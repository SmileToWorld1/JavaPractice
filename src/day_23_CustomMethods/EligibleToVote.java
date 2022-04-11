package day_23_CustomMethods;

public class EligibleToVote {

    public static void main(String[] args) {

        isEligibleToVote(25,"Turkey");

    }

    public static void isEligibleToVote(int age, String citizen){
        if (age>=21&&citizen.equalsIgnoreCase("USA"))
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote!");
    }

}
