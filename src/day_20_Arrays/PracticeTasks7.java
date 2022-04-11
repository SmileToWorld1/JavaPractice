package day_20_Arrays;

public class PracticeTasks7 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5, 4};
        int arr2[] = {4, 5, 6, 7, 8, 9};
        String result = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if ( arr1[i] == arr2[j]  ) {
                    if (result.contains(""+arr1[i])){
                        continue;
                    }
                    result += arr1[i]+" ";
                }
            }
        }
        System.out.println(result);
    }
}
