package day_39_Recap.animalTask;

public class Lion extends WildAnimal{

    public Lion( String breed, int age, char gender, char size, String color) {
        super("Lion", breed, age, gender, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" "+getBreed()+" is hunting a deer");
    }

}
