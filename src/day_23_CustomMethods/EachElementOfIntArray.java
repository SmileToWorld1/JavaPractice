package day_23_CustomMethods;

public class EachElementOfIntArray {
    public static void main(String[] args) {

        printEachElement(new int[] {2,3,5});

    }

    public static void printEachElement(int[] arr){

        for (int eachElement : arr) {
            System.out.print(eachElement+" ");
        }

    }

}
