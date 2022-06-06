import java.lang.reflect.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Teque {
    Scanner s = new Scanner(System.in);
    Deque<Integer> d = new LinkedList<Integer>();
    public void inputs(int loops) {
        int[] arr;
        for(int i = 0; i < loops; i++) {
            String commandString = s.nextLine();
            //Tar bort nummer från strängen
            String commandSub1 = commandString.replaceAll("\\d", "");
            String commandSub2 = commandSub1.replaceAll("\\s", "");
            //Tar bort allt utom nummer från strängen
            String numString = commandString.replaceAll("[^0-9]", "");
            Integer num = Integer.parseInt(numString);
            System.out.println(commandSub2);
            System.out.println(num);
            if(commandSub2.equals("push_back")) {
                System.out.println("pushing " + num);
                d.addLast(num);
            }
            else if(commandSub2.equals("push_front")) {
                System.out.println("pushing front " + num);
                d.addFirst(num);
            }
            else if(commandSub2.equals("push_middle")) {
                System.out.println("pushing middle " + num);
                pushMiddle(num);
            }
        }
        /*for(Integer i : d) {
            System.out.print(i);
        }*/
    }
    public void pushMiddle(int num) {
        int size = d.size();
        int pos = (size + 1)/2;
        Integer arr[] = new Integer[size];
        int i = 0;
        for(Integer x : d) {
            arr[i] = x;
            System.out.print(arr[i]);
            i++;
        }
        arr[pos] = num;
        d = arr;
    }
}
