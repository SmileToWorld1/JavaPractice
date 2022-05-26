package day_53_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

@FunctionalInterface
interface ArrayFunction<T,R>{
    R apply(T[] array);
}

public class ArrayFunctionTest {

    public static void main(String[] args) {

        ArrayFunction<Integer,Integer> maxArr = arr -> {
          return   Collections.max(Arrays.stream(arr).collect(Collectors.toList()));
        };

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(maxArr.apply(arr));

        System.out.println("-----------------------------------------");

        ArrayFunction<Integer,Integer> minArr = arr2 -> {
            return   Collections.min(Arrays.stream(arr2).collect(Collectors.toList()));
        };

        System.out.println(minArr.apply(arr));

        System.out.println("------------------------------------------");

        ArrayFunction<String,String> longestArr = s -> {
            String longestElement = "";
            for (String each : s) {
                if (each.length()>longestElement.length()){
                    longestElement = each;
                }
            }
            return longestElement;
        };

        String[] arr2 = {"Java","Python","Ruby","C++","C#"};

        System.out.println(longestArr.apply(arr2));

        System.out.println("---------------------------------------------");

        ArrayFunction<String,String> shortestArr = s -> {
            String shortestElement = s[0];
            for (String each : s) {
                if (each.length() < shortestElement.length()){
                    shortestElement = each;
                }
            }
            return shortestElement;
        };

        System.out.println(shortestArr.apply(arr2));
    }
}
