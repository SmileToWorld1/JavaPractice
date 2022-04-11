package day_20_Arrays;

import java.util.Arrays;

public class ReverseTheClassmateNames {
    public static void main(String[] args) {

        String classmates[] = {"Fatih", "Hamdi", "Kaan", "Sedat", "Ayhan",
                "Behsat", "Fuat", "Iskandar", "Mirşad", "Necip"};


        for (int i = 0; i < classmates.length; i++) {
            String result= "";
            for (int j = classmates[i].length() - 1; j >= 0; j--) {
              result += classmates[i].charAt(j);
            }
            System.out.println(result);
        }
        System.out.println(Arrays.toString(classmates).length());

    }
}
