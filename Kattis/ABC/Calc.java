import java.util.ArrayList;
import java.util.Scanner;

public class Calc {
    ArrayList<Conversation> conList = new ArrayList<Conversation>();
    Scanner s = new Scanner(System.in);

    public void phoneCalls(int n, int m){
        System.out.println(n +" "+ m);
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                conList.add(new Conversation(s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()));
                System.out.println(conList.get(j).print());
            } 
            for(int k = 0;k < m; k++) {
                
            }
        }
    }
}
