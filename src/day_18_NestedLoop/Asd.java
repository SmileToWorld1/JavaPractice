package day_18_NestedLoop;

import java.util.Scanner;

public class Asd {
    public static void main(String[] args) {

        String word="hwguhv";
        String result="";
         int count=0;

        for (int i = 0; i < word.length(); i++) {
            //int count=0;
            char ch=word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char ch2=word.charAt(j);
                if(ch==ch2){count++;}
                // result += ch+count+"";
            }
            if(result.contains(ch+"")){
                continue;
            }
            result += ""+ch+count;
        }
        System.out.println(result);
    }}
