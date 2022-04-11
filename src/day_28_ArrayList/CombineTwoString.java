package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoString {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<>();
        list1.addAll(Arrays.asList("D", "E", "F", "G"));
        ArrayList<String> newArr =  combineTwoString(list1,list2);
        System.out.println(newArr);

    }

    public static ArrayList<String> combineTwoString(ArrayList<String> list1,ArrayList<String> list2){

        list1.addAll(list2);
        return list1;
    }
}
