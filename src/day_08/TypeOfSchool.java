package day_08;

public class TypeOfSchool {
    public static void main(String[] args) {
        byte number = 8;

        boolean a = number >= 1 && number <= 5;
        boolean b = number >= 6 && number <= 8;
        boolean c = number >= 9 && number <= 12;
        boolean d = number >= 13 && number <= 16;
        boolean e = number >= 17 && number <= 18;

        if(a){
            System.out.println("Elementary school");
        }
        if(b){
            System.out.println("Middle school");
        }
        if(c){
            System.out.println("High school");
        }
        if(d){
            System.out.println("College");
        }
        if(e){
            System.out.println("Grad school");
        }
    }
}
/*
Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

            Assume that the given number is 1 ~ 18
 */

