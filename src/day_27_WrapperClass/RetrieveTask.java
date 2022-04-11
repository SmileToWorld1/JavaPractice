package day_27_WrapperClass;

public class RetrieveTask {

    public static void main(String[] args) {

          String str = "Wooden Spoon!";
          retrieve(str);

    }

    public static void retrieve(String str){
        String letter = "";
        String digit = "";
        String specialChar = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)){
                letter += each;
            }else if (Character.isDigit(each)){
                digit += each;
            }else{
                specialChar += each;
            }
        }
        System.out.println( "letters= \""+letter+
                           "\"\nDigits = \""+digit+
                           "\"\nspecialChars = \""+specialChar+"\""  );
    }
}
