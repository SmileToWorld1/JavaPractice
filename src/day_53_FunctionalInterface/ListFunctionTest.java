package day_53_FunctionalInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface ListFunction<T,R> {

    R apply (List<T> list);

}

public class ListFunctionTest {

    public static void main(String[] args) {

        ListFunction<Integer,Integer> maxNum = list -> {

           return Collections.max(list);

        };

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(maxNum.apply(list));

        System.out.println("------------------------------------------");

        ListFunction<Integer,Integer> minNum = l -> {

            return Collections.min(l);

        };

        System.out.println(minNum.apply(list));

        System.out.println("---------------------------------------------");

        ListFunction<String,String> longestStr = s -> {
            String longestElement = "";
            for (String each : s) {
                if (each.length()>longestElement.length()){
                    longestElement = each;
                }
            }
            return longestElement;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Java","Python","Ruby","C++","C#"));

        System.out.println(longestStr.apply(names));

        System.out.println("---------------------------------------------------");

        ListFunction<String,String> shortestStr = s -> {
            String shortestElement = s.get(0);
            for (String each : s) {
                if (each.length() < shortestElement.length()){
                    shortestElement = each;
                }
            }
            return shortestElement;
        };

        System.out.println(shortestStr.apply(names));

        System.out.println("-----------------------------------------------------");

        ListFunction<Integer,int[]> convertToIntArr = p -> {
            int[] result = new int[p.size()];
            for (int i = 0; i < p.size(); i++) {
                result[i] = p.get(i);
            }
            return result;
        };

        System.out.println(Arrays.toString(convertToIntArr.apply(list)));

        System.out.println("-----------------------------------------------");

        ListFunction<Double,double[]> convertToDoubleArr = p -> {
            double[] result = new double[p.size()];
            for (int i = 0; i < p.size(); i++) {
                result[i] = p.get(i);
            }
            return result;
        };

        List<Double> list2 = new ArrayList<>(Arrays.asList(1.5,2.5,3.5,4.5,5.5));

        System.out.println(Arrays.toString(convertToDoubleArr.apply(list2)));


    }

}
