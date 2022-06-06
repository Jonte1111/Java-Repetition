import javax.swing.DefaultListModel;
//GIGABRAIN
/**
 * Lista
 */
public class Lista<T>{
   private int max;
   private Object[] arr;
    public Lista() {
        max = 10;
        arr = new Object[max];
    }
    public void add(T item) {
        if(isFull()) {
            Object[] tmp = new Object[max];
            for(int i = 1;i<max;i++) {
                tmp[i - 1] = arr[i];
            }
            arr = tmp;
            arr[size() - 1] = item;
        }
        else {
            arr[size() + 1] = item;
        }
     
    }
    public boolean isFull() {
        int count = 0;
        for(Object o : arr){
            count++;
        }
        if(count == max) {
            return true;
        }
        else 
            return false;
    }
    public void print() {
        for(int i = 0;i<size();i++) {
            System.out.println(arr[i]);
        }
    }
    public int size() {
        int count = 0;
        for(Object o : arr) {
            count++;
        }
        return count;
    }
}