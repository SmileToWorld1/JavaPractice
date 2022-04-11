package day_24_CustomMethods_Return;

public class ContainsNumToArray {
    public static void main(String[] args) {

        int[] arr ={3, 5, 6, 8, 9};
        System.out.println(contains(arr,5));
    }

    //9. Create a method named contains that passes one integer array and one integer parameters,
    // the method returns true if the given integer is contained in the given array, otherwise returns false
        public static boolean contains(int[]arr,int num){

       boolean result= arr.toString().contains(""+num);
        return result;
        }
}
