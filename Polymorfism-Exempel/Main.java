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
        for(Super su: lista) //Kollar i run-time vilken version av f som ska köras
            su.f(); //Kör super/sub1/sub2:s versioner av f();
        //Konkret objekt
        Sub1 sub1obj = new Sub1();
        //Refererar till sitt barnbarn
        SuperDuper sd = sub1obj; 
        //Refererar till sitt barn
        Super sp = sub1obj;
        //Sd och sp kan endast se f 
        sd.f();
        sp.f();
        //Sub1obj kan se alla funktioner i sub1
        sub1obj.g();
        //m kan vara alla klasser som har implementerat movable
        Movable m = new Sub2();
        m.move();
        m = new OrelateradKlass();
        m.move();
        //En lista av objekt som implementerar movable
        ArrayList<Movable> movableStuff = new ArrayList<Movable>();
        movableStuff.add(m);
        movableStuff.add(new Sub2());
        movableStuff.add(new OrelateradKlass());
        for(Movable mov: movableStuff) {
            mov.move();
        }
    }
}