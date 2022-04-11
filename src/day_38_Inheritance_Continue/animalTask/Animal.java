package day_38_Inheritance_Continue.animalTask;

public class Animal {

    public String name, breed;
    public int age;
    public char gender, size;
    public String color;

    public Animal(String name, String breed, int age, char gender, char size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" : "+breed+" is eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
