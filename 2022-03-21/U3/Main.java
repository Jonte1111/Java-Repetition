/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        First first = new Second();
        first.f();
        //Second second = new First(); Funkar inte Barn kan inte vara parent
        Can can = new Third();
        can.f();
        /*Can can2 = new Second();
        can2.i(); Funkar inte eftersom i inte är definierad i interfacet Can */
        /*First first2 = new Can();
        first2.g(); Kan inte instansiera ett interface*/
    }
}