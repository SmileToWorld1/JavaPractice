package day_53_FunctionalInterface;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFunctionalInterfaceTest {

    public static void main(String[] args) {

        //4.1 Create a function that can return the sum of digits from a string

        Function<String,Integer> sumOfDigit = p-> {
            Integer result = 0;
            for (char each : p.toCharArray()) {
                if (Character.isDigit(each)){
                    result ++;
                }
            }
            return result;
        };

        System.out.println(sumOfDigit.apply("Asad1234asd"));

        System.out.println("----------------------------------------");

        //4.2 Create a function that can convert a Set of Integers to List of Integers

        Function<Set<Integer>,List<Integer>> convertToList = p-> {
            return new ArrayList<>(p);
        };

        Set<Integer> list = new HashSet<>(Arrays.asList(1,2,2,3,3,4,5));

        List<Integer> list1 = convertToList.apply(list);

        System.out.println(list1);

        System.out.println("--------------------------------------------");

        //4.3 Create a function that can convert a Set of String to List of String

        Function<List<Integer>,Set<Integer>> convertToSet = p-> {
            return new LinkedHashSet<>(p);
        };

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,2,3,3,4,5));

        Set<Integer> list3 = convertToSet.apply(list2);

        System.out.println(list3);

        System.out.println("----------------------------------------------");

        // 4.4 Create a function that can return the reversed version of an int array

        Function<int[],int[]> reversed = p-> {
            int[] arr = new int[p.length];
            for (int i = 0; i < p.length; i++) {
                arr[i]= p[p.length-1-i];
            }
            return arr;
        };

        int[] arr = {1,15,3,18,5,7,21,9,11};

        System.out.println(Arrays.toString(reversed.apply(arr)));

        System.out.println("--------------------------------------");

        //4.5 Create a function that can return the reversed version of a String array

        Function<String[],String[]> reversed2 = p-> {
            String[] arr2 = new String[p.length];
            for (int i = 0; i < p.length; i++) {
                arr2[i]= p[p.length-1-i];
            }
            return arr2;
        };

        String[] arr2 = {"Java","Python","C++","C#"};

        System.out.println(Arrays.toString(reversed2.apply(arr2)));

        System.out.println("-------------------------------------------");

        //4.6 Create a function that can return the sorted (decending) version of an int array
        //				Note: you can use the reverse function you created at 4.4

        Function<int[],int[]> sortedDec = p-> {
            return reversed.apply(Arrays.stream(p).sorted().toArray());
        };

        System.out.println(Arrays.toString(sortedDec.apply(arr)));


        System.out.println("------------------------------------------");

        //4.7 Create a function that can return the sorted (decending) version of a String array
        //				Note: you can use the reverse function you created at 4.5

        Function<String[],String[]> sortedDec2 = p-> {
            Object[] array = Arrays.stream(p).sorted().toArray();
            String[] arr3 = new String[array.length];
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = (String) array[array.length-1-i];
            }
            return arr3;
        };

        System.out.println(Arrays.toString(sortedDec2.apply(arr2)));


    }
}
