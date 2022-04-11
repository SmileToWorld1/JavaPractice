package day_27_WrapperClass;

import java.util.Arrays;

public class SwapTask {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] arr2 = swap(arr,2,4);

        System.out.println(Arrays.toString(arr2));

    }


    public static int[] swap(int[] array, int firstIndex, int secondIndex){

        int[] newArray = new int[array.length];
        int a= 0;
        for (int i = 0; i < newArray.length; i++) {
            if (i==firstIndex){
                newArray[i]=array[secondIndex];
                continue;
            }
            if (i == secondIndex){
                newArray[i] = array[firstIndex];
                continue;
            }
            newArray[i] = array[i];
        }
        return newArray;
    }
}
