package day_39_Recap.studentTask;

public class Student extends Person{

    private String schoolName, fieldOfStudy;
    private int schoolID;
    private char grade;

    public Student(String name, int age, char gender, String schoolName, String fieldOfStudy, int schoolID, char grade) {
        super(name, age, gender);
        setSchoolName(schoolName);
        setFieldOfStudy(fieldOfStudy);
        setSchoolID(schoolID);
        setGrade(grade);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public char getGrade() {
        return grade;
    }

    public void setSchoolName(String schoolName) {
        if (null==schoolName||schoolName.isEmpty()){
            System.err.println("Invalid school name: "+schoolName);
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (null==fieldOfStudy||fieldOfStudy.isEmpty()){
            System.err.println("Invalid fieldOfStudy: "+fieldOfStudy);
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public void setGrade(char grade) {
        if (!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }
        this.grade = grade;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", schoolName='" + schoolName + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolID=" + schoolID +
                ", grade=" + grade +
                '}';
    }
}
