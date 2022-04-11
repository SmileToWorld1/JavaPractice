public class Solution {

    public static int entranceFee = 2, firstFullOrPartialHourCost = 3, afterFirstHourHourlyCost = 4;

    public static int solution(String E, String L){

        int totalCost = 0;

        String[] entryHoursAndMinutes = E.split(":");
        int entryHour = Integer.parseInt(entryHoursAndMinutes[0]);
        int entryMinutes = Integer.parseInt(entryHoursAndMinutes[1]);

        String[] leftHoursAndMinutes = L.split(":");
        int leftHour = Integer.parseInt(leftHoursAndMinutes[0]);
        int leftMinutes = Integer.parseInt(leftHoursAndMinutes[1]);

        int totalParkingHours = leftHour-entryHour;
        int totalParkingMinutes = leftMinutes-entryMinutes;

        totalCost = entranceFee+firstFullOrPartialHourCost;

        if (totalParkingHours==1&&totalParkingMinutes>0){
            totalCost += afterFirstHourHourlyCost;
        }else if (totalParkingHours>1&&totalParkingMinutes<=0){
            totalCost += afterFirstHourHourlyCost*(totalParkingHours-1);
        }else if (totalParkingHours>1&&totalParkingMinutes>0){
            totalCost += afterFirstHourHourlyCost*(totalParkingHours);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        System.out.println(solution("10:00","13:21")); // 17
        System.out.println(solution("09:42","11:42")); // 9
        System.out.println(solution("09:30","11:10")); // 9
    }
}

class ParkingFee {

    public static void main(String[] args) {
        String E = "09:30";
        String L = "10:40";

        System.out.println(solution(E, L));
    }

    public static int solution(String E, String L){
        int parkingFee = 5;

        int entranceHour = Integer.parseInt(E.substring(0,2));
        int entranceMinute = Integer.parseInt(E.substring(3));

        int leaveHour = Integer.parseInt(L.substring(0,2));
        int leaveMinute = Integer.parseInt(L.substring(3));

        switch(leaveHour-entranceHour){
            case 1:
                if(leaveMinute > entranceMinute){
                    parkingFee += 4;
                }
                break;
            default:
                if(leaveMinute <= entranceMinute){
                    parkingFee += (leaveHour-entranceHour-1)*4;
                }else if(leaveMinute > entranceMinute){
                    parkingFee += (leaveHour-entranceHour)*4;
                }
                break;
        }
        return parkingFee;
    }
}
