package day_21_ForEachLoop;

import java.util.Arrays;

public class DescendingOrder {
    public static void main(String[] args) {

        int[] nums = {3, 7, 54, 65, 12};
        Arrays.sort(nums);

        int[] descending = new int[nums.length];
        int i = nums.length-1;

        for (int each : nums) {
            descending[i] = each;
            i--;
        }
        System.out.println(Arrays.toString(descending));
    }
}
