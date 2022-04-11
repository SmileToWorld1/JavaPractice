package day_11;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "venti";
        String result = "";

        if (size == "tall" || size=="grande" || size=="venti"){
            switch (size){

                case "tall":
                    result= "price is $3.69\n" +
                            "90 calories";
                    break;
                case "grande":
                    result= "price is $3.99;\n" +
                            "120 calories";
                    break;
                default:
                    result= "price is $4.29\n" +
                            "150 calories";
            }
        }else {
            result= "Invalid Size";
        }
        System.out.println(size+": "+result);
    }
}
