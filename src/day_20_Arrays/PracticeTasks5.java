package day_20_Arrays;

import java.util.Arrays;

public class PracticeTasks5 {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};
        int reversedArray[] = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            reversedArray[i] = array[(array.length-1)-i];
        }
        System.out.println(Arrays.toString(reversedArray));//[5, 4, 3, 2, 1]
    }
}
