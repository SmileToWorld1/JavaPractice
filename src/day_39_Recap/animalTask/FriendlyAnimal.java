package day_39_Recap.animalTask;

public class FriendlyAnimal extends Animal{

    public static boolean isWild;
    public static boolean isFriendly;
    public static boolean isPlayable;

    static {
        isWild = false;
        isFriendly = true;
        isPlayable = true;
    }

    public FriendlyAnimal(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void play(){
        System.out.println(getName()+" "+getBreed()+" is playing");
    }
    public void pet(){
        System.out.println(getName()+" "+getBreed()+" is a pet");
    }

}
