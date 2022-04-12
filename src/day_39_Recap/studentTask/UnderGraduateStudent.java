package day_39_Recap.studentTask;

public class UnderGraduateStudent extends Student{

    public UnderGraduateStudent(String name, int age, char gender, String schoolName, String fieldOfStudy, int schoolID, char grade) {
        super(name, age, gender, schoolName, fieldOfStudy, schoolID, grade);
    }

    @Override
    public void study() {
        System.out.println(getName()+" is studying final exams");
    }
}
