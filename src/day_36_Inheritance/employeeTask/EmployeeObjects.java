package day_36_Inheritance.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("İsmail","SDET",'M',28,1372,120000);
        tester.testing();
        tester.creatingTicket();
        tester.work();

        Developer developer = new Developer();
        developer.setInfo("Mehmet","Senior Developer",'M',28,1355,160000);
        developer.coding();
        developer.fixingBugs();
        developer.work();

        Teacher teacher = new Teacher();
        teacher.teaching();
        teacher.work();




    }


}
