package day_39_Recap.animalTask;

public class Dog extends FriendlyAnimal{

    public Dog( String breed, int age, char gender, char size, String color) {
        super("Dog", breed, age, gender, size, color);
    }

    public void bark(){
        System.out.println(getName()+" "+getBreed()+" is barking");
    }

}
