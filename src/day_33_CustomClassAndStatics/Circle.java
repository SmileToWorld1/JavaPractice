package day_33_CustomClassAndStatics;

public class Circle {

    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2; // this.radius*2
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", Pi=" + pi +
                ", area of the circle=" + calcArea() +
                ", perimeter of the circle=" + calcPerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1);
    }
}
