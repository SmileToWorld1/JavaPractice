package day_23_CustomMethods;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        isEligibleToBuyAlcohol(29);

    }

    public static void isEligibleToBuyAlcohol(int age){
        if (age>=18){
            System.out.println("You are eligible to buy an alcohol");
        }else{
            System.out.println("You are not eligible to buy an alcohol");
        }
    }
}
