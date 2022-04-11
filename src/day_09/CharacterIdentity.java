package day_09;

public class CharacterIdentity {
    public static void main(String[] args) {
       char identifyOfCharacter = 55;

       if (identifyOfCharacter>=48 && identifyOfCharacter<=57) {
           System.out.println("digit");
       }else if (identifyOfCharacter>=65 && identifyOfCharacter <=90 || identifyOfCharacter>=97 && identifyOfCharacter<=122){
           System.out.println("Alphabetic Character");
       }else {
           System.out.println("Special Character");
       }







    }
}
