package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int max = max(list);
        System.out.println(max);

    }
    public static int max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for (Integer each : list) {
            if (each>max){
                max = each;
            }
        }
        return max;
    }
}
