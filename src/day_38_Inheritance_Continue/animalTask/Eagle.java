package day_38_Inheritance_Continue.animalTask;

public class Eagle extends Animal{

    public Eagle( String breed, int age, char gender, char size, String color) {
        super("Eagle", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" : "+breed+" is eating a snake");
    }
}
