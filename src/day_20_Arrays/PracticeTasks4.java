package day_20_Arrays;

public class PracticeTasks4 {
    public static void main(String[] args) {

        String names[] = { "Anna", "Nancy", "Sarah"};
        int scores[] = {90, 75, 80};
        char grades[] = new char[names.length];

        for (int i = 0; i < names.length; i++) {
        grades[i] = (scores[i]>=90)? 'A' : (scores[i]>=80)? 'B' : (scores[i]>=70)? 'C' : (scores[i]>=60)? 'D' : 'F' ;
            System.out.println(names[i]+"'s score is "+scores[i]+ ", and grade is "+grades[i]);
        }
    }
}
