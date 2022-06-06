import java.util.ArrayList;

/**
 * Main
 */
public class Game {
    private ArrayList<Integer> list;
    public Game() {
       list = new ArrayList<Integer>(); 
    }
    private void balance() {
        if(list.size() < 5) {
            list.add(0);
        }
        else if(list.size() > 20) {
            list.remove(list.size());
        }
    }
}