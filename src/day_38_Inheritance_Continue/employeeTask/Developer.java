package day_38_Inheritance_Continue.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, String companyName, char gender, int age, int id, double salary) {
        super(name, jobTitle, companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working of integration test");
    }
}
