package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        Integer num =  firstDuplicatedElement(list);
        System.out.println(num);

    }
    public static Integer firstDuplicatedElement(ArrayList<Integer> list){
        Integer num = 0;
        for (Integer each : list) {
            int count = 0;
            for (Integer each2 : list) {
                if (each==each2){
                    count++;
                }
            }
            if (count>1){
                num = each;
                break;
            }
        }
        return num;
    }
}
