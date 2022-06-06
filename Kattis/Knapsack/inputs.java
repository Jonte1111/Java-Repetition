import java.util.Scanner;

public class inputs {
    Calc c = new Calc();
    Scanner s = new Scanner(System.in);
    public void input(int[] arr, int i) {
        if(i == 1)
            System.out.println(c.op1(arr));
        if(i == 2)
            System.out.println(c.op2(arr));
    }
}
