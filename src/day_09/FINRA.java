package day_09;

public class FINRA {
    public static void main(String[] args) {
        int number = 37;
        boolean FIN = number%3 == 0 && number%5 != 0;
        boolean RA = number%5 == 0 && number%3 != 0;
        boolean FINRA = number%3 == 0 && number%5 == 0;

        if (FIN){
            System.out.println("FIN");
        }else if (RA) {
            System.out.println("RA");
        }else if (FINRA) {
            System.out.println("FINRA");
        }else {
            System.out.println("Neither FIN nor RA");
        }

    }
}
