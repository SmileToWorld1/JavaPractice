package day_09;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 4;

        if (gradeNumber >= 1 && gradeNumber <= 6) {

            if (gradeNumber == 1) {
                System.out.println("location -  Apple orchard \nnumber of groups - 3 \nteacher in charge - Ms. Smith");
            } else if (gradeNumber == 2) {
                System.out.println("location - Zoo \nnumber of groups - 7 \nteacher in charge - Mr. Lee");
            } else if (gradeNumber == 3) {
                System.out.println("location - Aquarium\n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Wilson");
            } else if (gradeNumber == 4) {
                System.out.println("location - Movie theater  \n" +
                        "number of groups - 2\n" +
                        "teacher in charge - Ms. Reyes");
            } else if (gradeNumber == 5) {
                System.out.println("location - Museum \n" +
                        "number of groups - 5\n" +
                        "teacher in charge - Ms. Lela");
            } else {
                System.out.println("location - Six Flags\n" +
                        "number of groups - 8\n" +
                        "teacher in charge - Mr. Watt");
            }
        } else {
            System.out.println("Invalid GradeNumber");
        }

    }
}
