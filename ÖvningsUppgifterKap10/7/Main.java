import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player(new LinkedList<Kort>());
        Player p2 = new Player(new LinkedList<Kort>());
        p1.nyKortLek();
        p2.nyKortLek();
        p1.blanda();
        p2.blanda();
        System.out.println(p1.tittaPa(0).toString() + " | "+ p2.tittaPa(0).toString());
        if(p1.tittaPa(0).slag().valör > p2.tittaPa(0).slag().valör) {
            System.out.println("p1 wins");
        }
        else {
            System.out.println("p2 wins");
        }

    }
}