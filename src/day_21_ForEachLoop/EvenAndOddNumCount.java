package day_21_ForEachLoop;

public class EvenAndOddNumCount {
    public static void main(String[] args) {

        int[] nums = { 2, 5, 4, 9, 10, 11, 15, 16, 18, 20 };

        int countEven= 0;
        int countOdd=0;

        for (int each : nums) {
            if (each%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("countOdd = " + countOdd);
        System.out.println("countEven = " + countEven);

    }
}
