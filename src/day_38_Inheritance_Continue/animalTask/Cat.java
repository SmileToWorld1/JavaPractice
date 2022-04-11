package day_38_Inheritance_Continue.animalTask;

public class Cat extends Animal{

    public Cat( String breed, int age, char gender, char size, String color) {
        super("Cat", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" : "+breed+" eating a cat food");
    }
}
