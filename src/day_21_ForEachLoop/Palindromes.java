package day_21_ForEachLoop;
import java.util.Arrays;
public class Palindromes {
    public static void main(String[] args) {

        String[] arr1 = {"anna", "level", "Java"};
       int palindroms= 0;

        for (String each : arr1) {
            String str = "";
            for (int i = each.length()-1; i >=0 ; i--) {
                str += each.charAt(i);
            }
            if (str.equals(each)){
                palindroms++;
            }
        }
        System.out.println("palindroms = " + palindroms);
    }
}
