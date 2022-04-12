package day_39_Recap.animalTask;

public class Tiger extends WildAnimal{

    public Tiger(String breed, int age, char gender, char size, String color) {
        super("Tiger", breed, age, gender, size, color);
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" "+getBreed()+" is hunting antelope");
    }
}
