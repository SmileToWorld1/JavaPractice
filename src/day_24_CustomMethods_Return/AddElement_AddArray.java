package day_24_CustomMethods_Return;

import java.util.Arrays;

public class AddElement_AddArray {
    public static void main(String[] args) {

        int[] arr = {2,3,5,6};
        System.out.println(Arrays.toString(addElement(arr,4)));

    }

    //6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array
    public static int[] addElement(int[] arr, int number){
   /*     int[] arr1 = new int[arr.length+1];
        int a = 0;
        for (int each : arr) {
            arr1[a++]=each;
        }
        arr1[a]=number;
        return arr1;
     */
     int[] arr1 = Arrays.copyOf(arr,arr.length+1);
        arr1[arr.length]=number;
        return arr1;

    }



}
