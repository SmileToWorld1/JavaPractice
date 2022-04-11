package day_36_Inheritance.phoneTask;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.call(1231234567);
        iphone.brand = "Iphone";
        iphone.model ="13 Pro";
        iphone.color ="Blue";
        iphone.price = 750;
        iphone.text(1231234567);
        iphone.faceTime(1231234567);
        iphone.faceTime("appa@avatar.com");

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","Galaxy S22","Large","White",500);
        samsung.call(1231234567);
        samsung.text(1231234567);
        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","3310","Small","Blue",100);
        nokia.selfDefence();
        nokia.call(1231234567);

    }
}
