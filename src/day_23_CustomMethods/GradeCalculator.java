package day_23_CustomMethods;

public class GradeCalculator {
    public static void main(String[] args) {

      gradeCalculator(-5);

    }

    public static void gradeCalculator(int score){

     if (score<0 || score>100) {
         System.out.println("Invalid Grade");
     }
     else {
         System.out.println(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F");
     }

    }

}
