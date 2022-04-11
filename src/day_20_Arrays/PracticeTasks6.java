package day_20_Arrays;

import java.util.Arrays;

public class PracticeTasks6 {
    public static void main(String[] args) {

        int array[] = {10, 1, 5, 1, 2, 1};
        int newArray[] = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>1){
            newArray[index]=array[i];
            index++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==1){
                newArray[index]=array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
