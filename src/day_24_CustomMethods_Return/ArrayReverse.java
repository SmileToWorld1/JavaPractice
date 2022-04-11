package day_24_CustomMethods_Return;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] reverseA = reverseArray(new int[]{3, 5, 7, 9});
        System.out.println(Arrays.toString(reverseA));

    }

    public static int[] reverseArray(int arr[]){

    /*    int[] reverseArray = new int[arr.length];
        int zero= 0;
        for (int i =reverseArray.length-1 ; i >=0 ; i--) {
            reverseArray[i]=arr[zero++];
        }
       return reverseArray;
     */ int[] temp = new int[arr.length];
        for (int i =0; i < arr.length/2; i++) {
            temp[i]= arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp[i];
        }
        return arr;
    }

}
