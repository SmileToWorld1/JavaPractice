package day_11;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        String result= "";

        if (floorNum>=1&&floorNum<=3){
            switch (floorNum){
                case 1:
                    result="Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                    break;
                case 2:
                    result="Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
                default:
                    result="Floor 3 selected. Companies: Lyft, BofA, Stake house";
            }
        }else{
            result= "Invalid floor - 6";
        }
        System.out.println(result);

    }
}
