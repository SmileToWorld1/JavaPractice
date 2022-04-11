package day_38_Inheritance_Continue.employeeTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, String companyName, char gender, int age, int id, double salary) {
        super(name, "ProductOwner", companyName, gender, age, id, salary);
    }

    @Override
    public void work() {
        System.out.println(name+" is working of user stories");
    }
}
