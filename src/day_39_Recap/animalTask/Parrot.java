package day_39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot( String breed, int age, char gender, char size, String color) {
        super("Parrot", breed, age, gender, size, color);
    }

    public void fly(){
        System.out.println(getName()+" "+getBreed()+" is flying");
    }
    public void sing(){
        System.out.println(getName()+" "+getBreed()+" is singing");
    }

}
