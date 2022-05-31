import java.util.ArrayList;

public class Company extends AbstractOwner implements ThingInterface{
    ArrayList<AbstractOwner> owners;
    ArrayList<ThingInterface> things;
    public Company(ArrayList<AbstractOwner> owner, ArrayList<ThingInterface> thing) {
        this.owners = owner;
        this.things = thing;
    }
    @Override
    public ArrayList<AbstractOwner> getOwner() {
        // TODO Auto-generated method stub
        return this.owners;
    }

    @Override
    public ArrayList<ThingInterface> getOwnedThing(ThingInterface t) {
        // TODO Auto-generated method stub
        return this.things;
    }
    
}
