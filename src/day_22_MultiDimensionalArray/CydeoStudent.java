package day_22_MultiDimensionalArray;

import java.util.Arrays;

public class CydeoStudent {
    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][]batch25Groups = new String[3][];
            batch25Groups[0]=batch25Group1;
            batch25Groups[1]=batch25Group2;
            batch25Groups[2]=batch25Group3;

        System.out.println(Arrays.deepToString(batch25Groups));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][]batch24Groups = new String[3][];
        batch24Groups[0]=batch24Group1;
        batch24Groups[1]=batch24Group2;
        batch24Groups[2]=batch24Group3;

        System.out.println(Arrays.deepToString(batch24Groups));

        System.out.println("----------------------------------------");

        String[][][] CydeoStudents = new String[2][][];
        CydeoStudents[0]=batch25Groups;
        CydeoStudents[1]=batch24Groups;

        for (String[][] each2D : CydeoStudents) {
            for (String[] each1D : each2D) {
                for (String eachElement : each1D) {
                    System.out.print(eachElement+"\t");
                }
                System.out.println();
            }
        }
    }
}
