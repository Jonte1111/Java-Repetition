import java.util.ArrayList;

public class Person extends AbstractOwner{
    private String name;
    private String adress;
    private int age;
    private ArrayList<ThingInterface> things;
    public Person(String name, String adress, int age, ArrayList<ThingInterface> things) {
            this.name = name;
            this.adress = adress;
            this.age = age;
            this.things = things;
   } 
   public String getName() {
       return this.name;
   }
    public String getAdress() {
       return this.adress;
   }
    public int getAge() {
       return this.age;
   }
   public void adultOrNot() {
       if(this.age >= 18)
            System.out.println("Adult");
        else    
            System.out.println("Child");
   }
@Override
public ArrayList<ThingInterface> getOwnedThing(ThingInterface t) {
    // TODO Auto-generated method stub
    return this.things;
}
}
