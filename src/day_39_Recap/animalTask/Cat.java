package day_39_Recap.animalTask;

public class Cat extends FriendlyAnimal{

    public Cat( String breed, int age, char gender, char size, String color) {
        super("Cat", breed, age, gender, size, color);
    }

    public void scratch(){
        System.out.println(getName()+" "+getBreed()+" is scratching");
    }
    public void meow(){
        System.out.println(getName()+" "+getBreed()+" is meowing");
    }

}
