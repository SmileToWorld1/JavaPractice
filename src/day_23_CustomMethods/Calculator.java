package day_23_CustomMethods;

public class Calculator {
    public static void main(String[] args) {

calculator(5,10,'-');

    }

    public static void calculator(int num1, int num2, char mathOperator){

        System.out.println( mathOperator=='+'? num1+" "+mathOperator+" "+num2+" = "+(num1+num2) :
                mathOperator=='-'? num1+" "+mathOperator+" "+num2+" = "+(num1-num2) :
                mathOperator=='*'? num1+" "+mathOperator+" "+num2+" = "+(num1*num2) :
                 num1+" "+mathOperator+" "+num2+" = "+(num1/num2) );

    }


}
