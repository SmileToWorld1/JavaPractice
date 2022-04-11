package day_36_Inheritance.scrumTeamTask;

public class ProductOwner extends Employee{

    public void gather(){
        System.out.println(name+" is gathering requirement from client");
    }
    public void prepare(){
        System.out.println(name+" is preparing user stories with developers");
    }

}
