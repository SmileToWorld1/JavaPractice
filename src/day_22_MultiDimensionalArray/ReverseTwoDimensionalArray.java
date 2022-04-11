package day_22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseTwoDimensionalArray {
    public static void main(String[] args) {

      int[][] array = { {1,2,3} , {4,5,6} };
      int[][] reverse = new int[array.length][];
      int a = 0;
      for (int i = array.length-1; i>=0; i--){
          reverse[a]= new int [array[i].length];
          a++;
      }
/*
      a=0;
      for (int i= array.length-1; i>=0; i--) {
          int b = 0;
          for(int j = array[i].length-1; j>=0; j--){
              reverse[a][b]  = array[i][j];
              b++;
          }
          a++;
      }
      System.out.println(Arrays.deepToString(reverse));
*/
        for (int i= array.length-1; i>=0; i--) {
            for(int j = array[i].length-1; j>=0; j--){
                reverse[array.length-1-i][array[i].length-1-j]  = array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(reverse));
    }
}
