package day_43_Abstraction;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        if (name.isEmpty()||name.isBlank()){
            throw new RuntimeException("Invalid name: "+name);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();

    public String toString(){
        return "Name: "+name+
                ", Area: "+area()+
                ", Perimeter: "+perimeter();
    }
}
