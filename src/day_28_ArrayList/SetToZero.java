package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetToZero {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        setZero(list);
        System.out.println(list);



    }




    public static ArrayList setZero(ArrayList<Integer> list){

        list.set(list.size()-1,0);

        return list;
    }


}
