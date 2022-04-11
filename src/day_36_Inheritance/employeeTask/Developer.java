package day_36_Inheritance.employeeTask;

public class Developer extends Employee {

    public void coding(){
        System.out.println(name+" is coding");
    }
    public void fixingBugs(){
        System.out.println(name+" is fixing bugs");
    }
}
