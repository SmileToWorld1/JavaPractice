package day_23_CustomMethods;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        isAnagram("world","lord");
        isAnagram("silent","listen");
    }

    public static void isAnagram(String str1,String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)){
            System.out.println(str1+" and "+str2+" are anagram");
        }else
            System.out.println(str1+" and "+str2+" are not anagram");

    }



}
