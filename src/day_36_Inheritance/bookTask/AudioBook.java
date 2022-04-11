package day_36_Inheritance.bookTask;

public class AudioBook extends Book{
    public String narrator;
    public double length;

    public void listen(){
        System.out.println("I'm listening the "+title);
    }
}
