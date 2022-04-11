package day_24_CustomMethods_Return;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {

        String str = "smile";
        String str2 = "miles";
        String str3 = "ismail";
        System.out.println(isAnagram(str,str2));
        System.out.println("-------------------------");
        System.out.println(isAnagram(str,str3));

    }

    //2. create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    public static boolean isAnagram(String str1,String str2){

        char[] ch1 = str1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.toString(ch1).equals(Arrays.toString(ch2));
    }
}
