package day_39_Recap.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild;
    public static boolean isFriendly;
    public static boolean isPlayable;

    static {
        isWild = true;
        isFriendly = false;
        isPlayable = false;
    }

    public WildAnimal(String name, String breed, int age, char gender, char size, String color) {
        super(name, breed, age, gender, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" "+getBreed()+" is hunting");
    }

}
