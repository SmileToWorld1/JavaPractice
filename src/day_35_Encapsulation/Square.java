package day_35_Encapsulation;

public class Square {

    private double side;

    public void setSide(double side){
        if (side<=0){
            return;
        }
        this.side = side;
    }
    public Square(double side){
        setSide(side);
    }

    public double getSide(){
        return side;
    }

    public double calcArea(){
        return getSide()*getSide();
    }
    public double calcPerimeter(){
        return 4*getSide();
    }

    public String toString() {
        return "Square{ " +
                "side=" + getSide() +
                "calcArea=" + calcArea() +
                "calcPerimeter=" + calcPerimeter() +
                '}';
    }
}
