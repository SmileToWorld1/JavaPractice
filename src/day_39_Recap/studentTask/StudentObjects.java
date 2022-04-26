package day_39_Recap.studentTask;

public class StudentObjects {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Ismail",28,'M',"Automation",123,'A',8,22,"Java");

        System.out.println(cydeoStudent);

        cydeoStudent.eat();
        cydeoStudent.drink();
        cydeoStudent.sleep();
        cydeoStudent.study();


    }
}
