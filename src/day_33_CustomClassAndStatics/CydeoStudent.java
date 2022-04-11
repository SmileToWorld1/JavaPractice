package day_33_CustomClassAndStatics;

public class CydeoStudent {

    public String name;
    public int age, ID, batchNumber, groupNumber;
    public char gender, grade;
    public static String schoolName , programmingLanguage ;

    public CydeoStudent(String name, int age, int ID, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    static{
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+" is attending class");
    }

    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    public static void printProgramLanguage(){
        System.out.println(programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", school name=" + schoolName +
                ", programming language=" + programmingLanguage +
                '}';
    }
}
