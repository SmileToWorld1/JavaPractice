package day_09;

public class OxygenTank {
    public static void main(String[] args) {
        int number = 98;
        String note;

        if (number > 90 && number<=100) {
            note = "Your tank is full";
        } else if (number > 80 && number <= 90) {
            note = "Still okay";
        } else if (number > 70 && number <= 80) {
            note = "Don't go too far";
        } else if (number > 60 && number <= 70) {
            note = "Start to head back";
        } else if (number > 50 && number <= 60) {
            note = "Be careful now you at at 50%";
        } else {
            note = "You are dying man.";
        }

        System.out.println(note);
    }
}
