package day_24_CustomMethods_Return;

import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        int[] arr2 = {7,8,9,10};
        int[] merge2Arr = merge2Arr(arr,arr2);
        System.out.println(Arrays.toString(merge2Arr));

    }


    //7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array
    public static int[] merge2Arr(int[] arr1,int[] arr2){
 /*       int[] merge2Arr = Arrays.copyOf(arr1,arr1.length+arr2.length);
        int a= 0;
        for (int i = arr1.length; i<arr1.length+arr2.length; i++){
            merge2Arr[i]=arr2[a++];
        }
        return merge2Arr;
 */
        int[]merge2Arr = new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            merge2Arr[i]=arr1[i];
        }
        int a= 0;
        for (int i = arr1.length; i <arr1.length+arr2.length ; i++) {
            merge2Arr[i]=arr2[a++];
        }
        return merge2Arr;



    }



}
