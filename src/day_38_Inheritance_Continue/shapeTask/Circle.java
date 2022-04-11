package day_38_Inheritance_Continue.shapeTask;

public class Circle extends Shape{

    public double radius;
    public static double pi;

    static {
        pi = 3.14;
    }

    public Circle( double radius) {
        super("Circle");
        this.radius = radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public String toString(){
        return "Name: "+name+
                ", Radius: "+radius+
                ", Pi: "+pi+
                ", Area: "+area()+
                ", Perimeter: "+perimeter();
    }

}
