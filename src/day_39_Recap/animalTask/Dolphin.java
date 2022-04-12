package day_39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin( String breed, int age, char gender, char size, String color) {
        super("Dolphin", breed, age, gender, size, color);
    }
    public void swim(){
        System.out.println(getName()+" "+getBreed()+" is swimming");
    }

}
