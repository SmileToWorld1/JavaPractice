package day_39_Recap.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Kangal",3,'M','L',"Brown");
        System.out.println(dog);
        dog.bark();
        dog.pet();
        dog.eat();

        Lion lion = new Lion("King",5,'M','L',"Yellow");
        System.out.println(lion);
        lion.hunt();
        lion.drink();
        lion.move();


    }
}
