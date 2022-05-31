import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Djur> dL;
        dL = new ArrayList<Djur>(); 
        dL.add(new Häst()); 
        dL.add(new Fiskmås()); 
        dL.add(new Känguru()); 
        dL.add(new Torsk()); 
        dL.add(new Örn()); 
        dL.add(new Lax()); 
        for(Djur d : dL) {
            d.sound();
        }
    }
}