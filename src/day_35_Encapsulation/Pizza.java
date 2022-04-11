package day_35_Encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;

    public void setSize(String size){
        if (!(size.equalsIgnoreCase("small")||size.equalsIgnoreCase("medium")||size.equalsIgnoreCase("large"))){
            return;
        }
        this.size = size;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping){
        if (numberOfCheeseTopping<0 || size!=null && size.equalsIgnoreCase("small")&&numberOfCheeseTopping>3||
        size!=null && size.equalsIgnoreCase("medium")&&numberOfCheeseTopping>4||
        size!=null && size.equalsIgnoreCase("large")&&numberOfCheeseTopping>5){
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping){
        if (numberOfPepperoniTopping<0||size!=null && size.equalsIgnoreCase("small")&&numberOfPepperoniTopping>4||
                size!=null && size.equalsIgnoreCase("medium")&&numberOfPepperoniTopping>5||
                size!=null && size.equalsIgnoreCase("large")&&numberOfPepperoniTopping>6){
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    public double calcCost(){
        double totalPrice = 0;
        if (size != null && size.equalsIgnoreCase("small")){
            totalPrice = 10;
        }else if (size!=null && size.equalsIgnoreCase("medium")){
            totalPrice = 12;
        }else if(size!=null && size.equalsIgnoreCase("large")){
            totalPrice = 14;
        }
        totalPrice += 2*numberOfPepperoniTopping;
        totalPrice += 2*numberOfCheeseTopping;
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", calcCost=" + calcCost() +
                '}';
    }
}

class PizzaObjects{

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Medium",3,4);
        Pizza pizza2 = new Pizza("Small",2,3);
        Pizza pizza3 = new Pizza("LaRge",1,1);
        Pizza pizza4 = new Pizza("Medium",5,8);
        Pizza pizza5 = new Pizza("Small",9,15);
        Pizza pizza6 = new Pizza("LaRge",-4,-8);
        Pizza pizza7 = new Pizza("Orta",2,3);

        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
        System.out.println(pizza4);
        System.out.println(pizza5);
        System.out.println(pizza6);
        System.out.println(pizza7);
    }
}
