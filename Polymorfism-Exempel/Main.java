import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /* Super s = new Super();
        s.f();
        
        Sub1 s1 = new Sub1();
        s1.f();
        s1.g();

        Sub2 s2 = new Sub2();
        s2.f();
        s2.h();
        */
        ArrayList<Super> lista = new ArrayList<Super>();
        lista.add(new Super());
        lista.add(new Sub1()); //Funkar eftersom Sub1 och två ärver av Super
        lista.add(new Sub2());
        for(Super su: lista)
            su.f(); //Kör super/sub1/sub2:s versioner av f();
        
    }
}