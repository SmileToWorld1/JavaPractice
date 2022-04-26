package day_43_Abstraction;

public final class Circle extends Shape{

    private double radius;
    private final static double pi;

    static {
        pi = 3.14;
    }

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        if (radius<=0){
            throw new RuntimeException("Invalid radius: "+radius);
        }
        return radius;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public String toString(){
        return "Circle{"+
                ", Radius: "+radius+
                ", Pi: "+getPi()+
                ", Area: "+area()+
                ", Perimeter: "+perimeter()+
                '}';
    }
}