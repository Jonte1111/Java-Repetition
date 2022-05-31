public class Super extends SuperDuper{
    @Override
    public /*final*/ void f() { //Final cannot be overridden
        System.out.println("f i Super");
    }
    
}