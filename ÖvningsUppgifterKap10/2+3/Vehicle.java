import java.util.ArrayList;

public class Vehicle implements ThingInterface{
    private ArrayList<AbstractOwner> owner;
    public Vehicle(ArrayList<AbstractOwner> owner) {
        this.owner = owner;
    }
    public void print() {
        System.out.println("Ett fordon");
    }

    @Override
    public ArrayList<AbstractOwner> getOwner() {
        // TODO Auto-generated method stub
        return this.owner;
    }
}
