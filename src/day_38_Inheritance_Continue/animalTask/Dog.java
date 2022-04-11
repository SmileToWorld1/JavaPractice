package day_38_Inheritance_Continue.animalTask;

public class Dog extends Animal{

    public Dog( String breed, int age, char gender, char size, String color) {
        super("Dog", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" : "+breed+" is eating a dog food");
    }
}
