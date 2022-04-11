package day_24_CustomMethods_Return;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int index = 2;
        array= removeElement(array,2);
        System.out.println(Arrays.toString(array));

    }

    public static int[] removeElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[a++] = arr[i];
        }
        return newArray;
    }
}
