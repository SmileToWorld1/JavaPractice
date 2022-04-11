package day_10;

public class GradeLevel {
    public static void main(String[] args) {

        byte number= 3;
        String school ="";

        if (number>=1 && number<=18){
            if (number<=5){
              school= "Elementary school";
            }else if (number<=8){
                school= "Middle school";
            }else if (number<=12) {
                school = "High school";
            }else if (number<=16){
                    school= "College";
            }else{
                school= "Grand School";
            }

        }else {
           school = "Invalid grade level given";
        }

        System.out.println(school);
    }
}
