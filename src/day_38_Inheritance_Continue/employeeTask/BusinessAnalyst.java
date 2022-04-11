package day_38_Inheritance_Continue.employeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, String companyName, char gender, int age, int id, double salary) {
        super(name, "BusinessAnalyst", companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working of project' budget");
    }
}
