package day_15_ForLoop;

import java.util.Scanner;

public class outOfLesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int numjava=0;
        int numpytn=0;




        for (int i=0; i<sentence.length()-4; i++){
 /*           normally range is here =>  int i=0; i<sentence.length()
         if you added +4 your i value your range i<sentence.length()-4 (your max last character= sentence.length()-5)
         Here is important if you want to use charAt method this range is correct,
         but you want to use substring and your second value (exclude) ==> it's mean you should add range +1, and you can check last character
          if you want to check last character(sentence.length()-5) in substring method:

                                                                                                            i(sentence.length()-4)<sentence.length()-3
         sentence.substring(                                                      ,                          sentence.length()-4)<== (you can give max this range)
          compiler checks   sentence.length()-8, sentence.length()-7, sentence.length()-6, sentence.length()-5 ====> this is  your last character: (length()-5 + 4) = length()-1


         */          String jav=sentence.substring(i,i+4);
            if(jav.equals("java"))
                numjava++;

        }
        for (int i=0;i<sentence.length()-5; i++){

            String pytn=sentence.substring(i,i+6);
            if(pytn.equals("python"))
                numpytn++;
        }

        if(numjava==numpytn){System.out.print("true");}
        else {System.out.print("false");}

    }
}
