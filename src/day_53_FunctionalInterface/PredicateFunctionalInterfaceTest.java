package day_53_FunctionalInterface;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceTest {

    public static void main(String[] args) {

        //3.1 Create a function that can verify if a String contains duplicated characters

        Predicate<String> hasDuplicatedElement = p -> {
        return  new ArrayList<>(Arrays.asList(p.split(""))).stream().count()
                == new HashSet<>(Arrays.asList(p.split(""))).stream().count();
        };

        String str = "abvc";

        System.out.println(hasDuplicatedElement.test(str));

        System.out.println("-------------------------------------------------------");
        //3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:

        Predicate<String> isStrongPassword = p -> {
            boolean result = false;
            char[] arr = p.toCharArray();
            for (char each : arr) {
                if (Character.isUpperCase(each)){
                    for (char each2 : arr) {
                        if (Character.isLowerCase(each2)){
                            for (char each3 : arr) {
                                if (Character.isDigit(each3)){
                                    for (char each4 : arr) {
                                        if (each4 == ' '){
                                            for (char each5 : arr) {
                                                if (!Character.isLetterOrDigit(each5)&&each5!=' '){
                                                    if (p.toCharArray().length >= 8){
                                                        result = true;
                                                    }}}}}}}}}}};

            return result;
        };

        System.out.println(isStrongPassword.test("Aa 1_asdasd"));


    }

}
