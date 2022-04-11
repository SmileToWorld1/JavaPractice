package day_10;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int peopleOnTheShip = 42;
        String total = "";
        int crew = 20;

        if (peopleOnTheShip>=0 && peopleOnTheShip<=100){
                if (peopleOnTheShip<=50){
                    total = crew + " crew, " + (peopleOnTheShip-crew) +" passengers";
                }else if (peopleOnTheShip<=75){
                    crew= 25;
                    total= crew + " crew, " + (peopleOnTheShip-crew)+" passengers";
                }else {
                    crew= 30;
                    total= crew + " crew, " + (peopleOnTheShip-crew)+" passengers";
                }
        }else {
            total= "not valid ";
        }

        System.out.println(total);
    }
}
