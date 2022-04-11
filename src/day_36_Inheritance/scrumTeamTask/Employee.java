package day_36_Inheritance.scrumTeamTask;

public class Employee extends Person{

    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(int id, String jobTitle, double salary,String name, int age, char gender) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.gender = gender;
     // super.setInfo(name, age, gender); // super method
     // super.name = name; // super variable
     // super.age = age;   // super variable
     // super.gender = gender; // super variable
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
