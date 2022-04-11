package day_35_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<=0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            return;
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String toString() {
        String result= "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
        if (price==0){
            result= "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price= free" +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }
        return result;
    }
}

class CandyFactory{

    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                 new Candy("ülker",50,120,true),
                 new Candy("Nestle",100,400,true),
                 new Candy("Kit Kat",25,100,false),
                new Candy("Jelly Belly",20,40,false),
                new Candy("Brach's",5,20,true)
        ));

        for (Candy candy : list) {
            System.out.println(candy.getBrand()+" : "+ candy.getPrice());
        }
    }
}