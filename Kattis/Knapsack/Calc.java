public class Calc {
    public void run(int x, int[] y) {

    }
    
    public String op1(int[] y) {
        for(int i = 0; i < y.length; i++) {
            for(int j = 1; j < y.length ;j++) {
                if((y[i] + y[j]) == 7777) {
                    return "Yes";
                }
            }
        }
        return "No";
    }

    public String op2(int[] y) {
        for(int i = 0; i < y.length; i++) {
            for(int j = i+1; j < y.length ;j++) {
                System.out.println(y[i] + " " + y[j]);
                if(y[i] == y[j]) {
                    return "Contains duplicate";
                }
            }
        }
        return "Unique";
    }
}
