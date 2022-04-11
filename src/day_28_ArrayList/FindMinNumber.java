package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMinNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int min = min(list);
        System.out.println(min);

    }
    public static int min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for (Integer each : list) {
            if (each<min){
                min = each;
            }
        }
        return min;
    }
}