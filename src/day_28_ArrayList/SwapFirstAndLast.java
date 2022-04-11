package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapFirstAndLast {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        swapFirstAndLastChar(list);
        System.out.println(list);
    }

    public static ArrayList swapFirstAndLastChar(ArrayList<Integer> list){
        int temp = list.get(0);
        list.set(0,list.get(list.size()-1));
        list.set(list.size()-1,temp);
        return list;
    }
}
