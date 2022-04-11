package day_28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTotalNumbers {
    public static void main(String[] args) {

        ArrayList<Integer>  scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        countTotalNumberOfGrade(scores);

    }

    public static void countTotalNumberOfGrade(ArrayList<Integer> list){
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : list) {
        boolean a= (each>=90&&each<=100)? gradeOfA.add(each) : (each>=80&&each<=89)? gradeOfB.add(each) :
                (each>=70&&each<=79)? gradeOfC.add(each) : (each>=60&&each<=69)? gradeOfD.add(each) :
                (each>=0&&each<=59)? gradeOfF.add(each) : false ;
        }
        System.out.println("Grade A: "+gradeOfA.size()+", Grade B: "+gradeOfB.size()+
                ", Grade C: "+gradeOfC.size()+", Grade D: "+gradeOfD.size()+", Grade F: "+gradeOfF.size());
    }
}
