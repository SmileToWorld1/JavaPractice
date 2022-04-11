package day_11;

public class CydeoBatches {
    public static void main(String[] args) {

        String batches = "EU";

        if (batches=="US morning"||batches=="US evening"||batches=="EU"){

            switch (batches){
                case "US morning":
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                    break;
                case "US evening":
                    System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                     break;
                default:
                    System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");

            }

        }else{
            System.out.println("Invalid Batches");
        }



    }
}
