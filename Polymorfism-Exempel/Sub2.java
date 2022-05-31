public class Sub2 extends Super implements Movable{
    @Override
    public void f() {
        System.out.println("f i Sub2");
    }
    public void h() {
        System.out.println("h i Sub2");
    }
    //Implementerad funktion, måste finnas med
    @Override
    public void move() {
        // TODO Auto-generated method stub
       System.out.println("Move sub2"); 
    }
}