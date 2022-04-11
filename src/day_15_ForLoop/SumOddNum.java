package day_15_ForLoop;

public class SumOddNum {
    public static void main(String[] args) {

        int oddNum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%2==1){
                oddNum += i;
            }
        }
        System.out.println("oddNum = " + oddNum);
    }
}
//2. Write a program that can return the sum of odd numbers between 1 to 100