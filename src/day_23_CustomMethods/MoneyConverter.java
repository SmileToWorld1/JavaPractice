package day_23_CustomMethods;

public class MoneyConverter {
    public static void main(String[] args) {

        converterDollarToEuro(100);

        System.out.println("--------------------------");

        converterDollarToLira(100);

    }

    public static void converterDollarToEuro(double dollars){

        System.out.println(dollars+ "$ equals to "+ dollars*0.92+"€");
    }

    public static void converterDollarToLira(double dollars){
        System.out.println(dollars+ "$ equals to "+ dollars*14.58+"TL");
    }



}
