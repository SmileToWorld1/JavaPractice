package day_24_CustomMethods_Return;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java python is python_java, jaVa is pythOn morPythoNe readable, much ajav";

        System.out.println( freqOfWord(str,"java") );
        System.out.println(freqOfWord(str,"python"));
    }
    /*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence

 */ public static int freqOfWord(String sentence, String word){
     int result= 0;
        for (int i = 0; i < sentence.length() - word.length()+1; i++) {
            if (sentence.substring(i,(i+word.length())).equalsIgnoreCase(word) ){
                result++;
            }
        }
        return result;
    }
}
