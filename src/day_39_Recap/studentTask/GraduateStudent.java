package day_39_Recap.studentTask;

public class GraduateStudent extends Student {

    public GraduateStudent(String name, int age, char gender, String schoolName, String fieldOfStudy, int schoolID, char grade) {
        super(name, age, gender, schoolName, fieldOfStudy, schoolID, grade);
    }
    public void study(){
        System.out.println(getName()+" is studying ALES");
    }

}
