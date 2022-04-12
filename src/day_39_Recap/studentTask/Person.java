package day_39_Recap.studentTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        if (null==name||name.isEmpty()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }
        char[] chars = name.toCharArray();
        for (char each : chars) {
            if (!(Character.isLetterOrDigit(each)||each==' ')){
                System.err.println("Invalid name: "+name);
                System.exit(1);
            }
        }
        this.name = name;
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
    public void eat(){
        System.out.println(name+" "+" is eating");
    }
    public void drink(){
        System.out.println(name+" "+" is drinking");
    }
    public void sleep(){
        System.out.println(name+" "+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
