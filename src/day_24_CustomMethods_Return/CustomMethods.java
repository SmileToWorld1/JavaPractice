package day_24_CustomMethods_Return;

import java.util.Arrays;

public class CustomMethods {
    public static void main(String[] args) {

        String str = removeDuplicate("asdasdads");
        System.out.println(str);

        System.out.println("--------------------------");

        int[] arr = {2,3,43,53};
        int max = maxNum(arr);
        int max1= maxNum(new int[]{5,12,56,103});
        System.out.println(max);
        System.out.println(max1);

        System.out.println("---------------------------");

        int minNum = minNum(new int[]{5, 75, 8, 95, 1});
        System.out.println("minNum = " + minNum);

        System.out.println("--------------------------");

        int[] sat = reverseArray(new int[]{3, 5, 7, 9});
        System.out.println(Arrays.toString(sat));

        System.out.println("-------------------------");
        int[] oneDim1 = {1,2,3};
        int[] oneDim2 = {4,5};
        int[] merge = mergeArray(oneDim1,oneDim2);
        System.out.println(Arrays.toString(merge));


    }

    //1. create a method that can remove duplicated characters from a string and returns the new value
    //					"aaabbcccc" ===> "abc"
    public static String removeDuplicate(String str) {

        String result = "";
        for (char each : str.toCharArray()) {
            if (!result.contains(each + "")) {
                result += each;
            }
        }
        return result;
    }

    //2. create a method that can return the maximum number from an array of integers
    public static int maxNum(int[] arr){
        int maxNum= Integer.MIN_VALUE;
        for (int each : arr) {
            if (each>maxNum){
                maxNum=each;
            }
        }
        return maxNum;
    }

    //3. create a method that can return the minimum number from an array of integers
    public static int minNum(int[] arr){
        int minNum= Integer.MAX_VALUE;
        for (int each : arr) {
            if (each<minNum){
                minNum=each;
            }
        }
        return minNum;
    }


    //4. create a method that return the reversed array
    //					{1,2,3,4,5} === > {5,4,3,2,1}
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


    //5. create a method that can merge two arrays and return the new array
    //				arr1 = {1,2,3}
    //				arr2 = {4,5}
    //				{1,2,3,4,5}

    public static int[] mergeArray(int [] arr, int [] ar2){
        int[] mergeArr = new int[arr.length+ar2.length];
        int temperature=0;
        for (int each : arr) {
            mergeArr[temperature++]=each;
        }
        for (int each : ar2) {
            mergeArr[temperature++]=each;
        }
        return mergeArr;
    }




}
