package day_31_Constructor.Restaurant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Uşak Team","Ankara",5);

        Server server1 = new Server("Müco",12,20,true);
        Server server2 = new Server("Neco",13,18,true);
        Server server3 = new Server("Fero",14,14,false);
        Server server4 = new Server("Ibo",15,25,true);
        Server[] servers = {server2,server3,server4};
        restaurant1.servers.add(server1);

        Chef chef1 = new Chef("Iso",20,50,true);
        Chef chef2 = new Chef("Memo",21,50,true);
        Chef chef3 = new Chef("Olço",22,50,true);
        Chef chef4 = new Chef("Apo",23,40,false);
        Chef[] chefs = {chef2,chef3,chef4};
        restaurant1.chefs.add(chef1);

        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);

        System.out.println(restaurant1);


    }
}
