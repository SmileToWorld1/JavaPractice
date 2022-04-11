package day_09;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 25, n2 = 15;
        char mathOperator = '/';

        if (mathOperator == '-') {
            System.out.println(n1 - n2);
        }else if (mathOperator == '+') {
            System.out.println(n1 + n2);
        }else if (mathOperator == '*') {
            System.out.println(n1 * n2);
        }else if (mathOperator == '/'){
            System.out.println(n1 / n2);
        }else {
            System.out.println("Invalid operator");
        }






    }
}
