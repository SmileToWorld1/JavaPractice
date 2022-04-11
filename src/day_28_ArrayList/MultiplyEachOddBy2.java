package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyEachOddBy2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        multiplyEachOddBy2(list);
        System.out.println(list);

    }

    public static ArrayList multiplyEachOddBy2(ArrayList<Integer> list){
        for (int i = 0; i< list.size(); i++) {
            if (list.get(i)%2==1){
                list.set(i,list.get(i)*2);
            }
        }
        return list;
    }
}
