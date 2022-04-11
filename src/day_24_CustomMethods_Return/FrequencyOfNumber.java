package day_24_CustomMethods_Return;

public class FrequencyOfNumber {
    public static void main(String[] args) {

        int[] num= {1,2,2,2,3,2,3,2};
        System.out.println(  frequencyOfNumber(num,2) );

    }

    // 5. create method that accepts one integer array and one integer number and returns the frequency of the number
    public static int frequencyOfNumber(int[] arr, int number){

        int num = 0;
        for (int each : arr) {
            if (each==number){
                num++;
            }
        }
        return num;
    }

}
