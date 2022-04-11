package day_36_Inheritance.phoneTask;

public class Iphone extends Phone{

    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber+" number' "+ brand+" : "+ model+" phone has faceTime function");
    }
    public void faceTime(String email){
        System.out.println(brand+" : "+model+" is sending essay with "+email);
    }

}
