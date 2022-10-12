/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       Stack s = new Stack(); 
       s.push(5);
       s.push(4);
       s.push(3);
       s.push(2);
       try {
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
       }catch(StackException se) {
           System.out.println(se.getMessage());
       }
       s.print();
    }
}