package day_33_CustomClassAndStatics;

public class Dog {

    public String breed, color;
    public int age;
    public char size, gender;
    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly = true;


    public Dog(String breed, String color, int age, char size, char gender) {
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.size = size;
        this.gender = gender;
    }

    public void eat(){
        System.out.println(breed+ " are eating");
    }
    public void sleep(){
        System.out.println(breed+" are sleeping");
    }
    public void play(){
        System.out.println(breed+" are playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", gender=" + gender +
                '}';
    }
}
