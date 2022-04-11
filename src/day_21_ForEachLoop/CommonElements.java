package day_21_ForEachLoop;
import java.util.Arrays;
public class CommonElements {
    public static void main(String[] args) {
       int[] arr1 = {2, 6, 8, 12, 15, 3, 7};
       int[] arr2 = { 3, 5, 8, 15, 22, };

       String common ="";
        for (int each : arr1) {
            for (int each2 : arr2) {
                if (each==each2&& !common.contains(""+each)){
                    common += each+" ";
                }
            }
        }
        System.out.println("common = " + common);
    }
}
