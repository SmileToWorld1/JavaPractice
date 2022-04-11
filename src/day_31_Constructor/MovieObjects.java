package day_31_Constructor;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie("USA","Journey to SDET: Cydeo Batch EU8","08/10/2022","Kuzzat Altay");
        String[] arr = {"Asiya","Adam","Muhtar","Fuat","Kaan","Iskandar","Necip","Hamdi"};
        movie1.addCast(arr);
        movie1.genre = "Adventure, Comedy, Thriller";

        System.out.println(movie1);

    }
}
