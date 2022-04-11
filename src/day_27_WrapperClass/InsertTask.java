package day_27_WrapperClass;

import java.util.Arrays;

public class InsertTask {

    public static void main(String[] args) {
       int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = insert(arr,2,100);
        System.out.println(Arrays.toString(arr2));

    }
    // insert the new element into the array, and return new array
    public static int[] insert(int[] array, int index, int element){
        int[] newArray =new int[array.length+1];
        int a = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            newArray[i] = array[a++];
        }
        return newArray;
    }
    // insert the new element into the array, and return new array
    public static double[] insert(double[] array, int index, double element){
        double[] newArray =new double[array.length+1];
        int a = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            newArray[i] = array[a++];
        }
        return newArray;
    }
    // insert the new element into the array, and return new array
    public static char[] insert(char[] array, int index, char element){
        char[] newArray =new char[array.length+1];
        int a = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            newArray[i] = array[a++];
        }
        return newArray;
    }
    // insert the new element into the array, and return new array
    public static String[] insert(String[] array, int index, String element){
        String[] newArray =new String[array.length+1];
        int a = 0;
        for (int i = 0; i < newArray.length ; i++) {
            if (i==index){
                newArray[i] = element;
                continue;
            }
            newArray[i] = array[a++];
        }
        return newArray;
    }




}
