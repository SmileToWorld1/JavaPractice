package day_39_Recap.animalTask;

public class Animal {

    private String name, breed;
    private int age;
    private char gender, size;
    private String color;

    public Animal(String name, String breed, int age, char gender, char size, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name==null||name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed==null||breed.isEmpty()||breed.isBlank()){
            System.err.println("Invalid breed: "+breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age<=0){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender=='M'||gender=='F')){
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColor(String color) {
        if (color==null||color.isEmpty()||color.isBlank()){
            System.err.println("Invalid color: "+color);
            System.exit(1);
        }
        this.color = color;
    }

    public void eat(){
        System.out.println(name+" "+ breed+" is eating");
    }
    public void drink(){
        System.out.println(name+" "+breed+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" "+breed+" is sleeping");
    }
    public void move(){
        System.out.println(name+" "+breed+" is moving");
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
