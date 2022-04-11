package day_38_Inheritance_Continue.animalTask;

public class Tiger extends Animal{

    public Tiger( String breed, int age, char gender, char size, String color) {
        super("Tiger", breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name+" : "+breed+" is eating a deer");
    }
}
