package day_33_CustomClassAndStatics;

public class Person {

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman = true, hasNose = true, hasWings = false;
    public static int numberOfHead = 1, numberOfEye = 1;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String eat){
        System.out.println(name+" is eating "+eat);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
