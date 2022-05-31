import java.util.ArrayList;

public class EngineVehicle extends Vehicle{
    String regNum;
    public EngineVehicle(ArrayList<AbstractOwner> owner, String regNum) {
        super(owner);
        this.regNum = regNum;
    }
@Override
   public void print() {
        System.out.println("Ett motorfordon med regnummer: " + this.regNum);
   }
@Override
public ArrayList<AbstractOwner> getOwner() {
    // TODO Auto-generated method stub
    return null;
}
}
