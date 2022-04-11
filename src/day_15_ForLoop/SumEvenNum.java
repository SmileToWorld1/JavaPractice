package day_15_ForLoop;

public class SumEvenNum {
    public static void main(String[] args) {

        int result=0;

        for (int i = 1; i <= 100 ; i++) {

            if (i%2==0){
                result += i;
            }
        }
        System.out.println("result = " + result);
    }
}
//1. Write a program that can return the sum of even numbers between 1 to 100