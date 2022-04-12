package day_39_Recap.animalTask;

public class Bear extends WildAnimal{

    public Bear( String breed, int age, char gender, char size, String color) {
        super("Bear", breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting a fish");
    }

}
