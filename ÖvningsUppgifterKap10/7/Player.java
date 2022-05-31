import java.util.LinkedList;

public class Player extends Kortbunt{
    private LinkedList<Kort> bunt;
    public Player(LinkedList<Kort> bunt) {
        this.bunt = bunt;
    }
    public LinkedList<Kort> getBunt() {
        return this.bunt;
    }
}
