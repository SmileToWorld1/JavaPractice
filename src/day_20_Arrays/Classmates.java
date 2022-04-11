package day_20_Arrays;

public class Classmates {
    public static void main(String[] args) {

        String classmates[] = { "Fatih A", "Hamdi B", "Kaan C", "Sedat D", "Ayhan E",
                "Behsat F", "Fuat G", "Iskandar H", "Mirşad J", "Muhammedjan K", "Necip L", "Yılkıatı M"};

        for (int i = 0; i < classmates.length; i++) {
            System.out.println(classmates[i].charAt(0)+" "+ classmates[i].charAt(classmates[i].indexOf(" ")+1));
        }
    }
}
