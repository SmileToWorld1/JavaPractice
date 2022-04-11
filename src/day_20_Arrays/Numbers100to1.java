package day_20_Arrays;

import java.util.Arrays;

public class Numbers100to1 {
    public static void main(String[] args) {


        int numbers[]=new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=100-i;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
