package day_23_CustomMethods;

public class isPozNegOrZero {
    public static void main(String[] args) {

    pozNegOrZero(0);

    }

    public static void pozNegOrZero(int number){
        System.out.println( number>0? (number+" is a positive number") : number<0? (number+" is a negative number") : (number+" is a zero") );
    }

}
