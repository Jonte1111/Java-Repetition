public class Stack {
    private Node top;
    public Stack() {
        top=null;
    }
    public void push(int varde) {
        Node tmp = new Node();
        tmp.setData(varde);
        tmp.setNext(top);
        top = tmp;
    }
    public int pop() throws StackException{
        int ret;
        if(isEmpty()) 
            throw new StackException("Stacken var tom");
        ret = top.getData();
        top = top.getNext();
        return ret;
    }
    public int size() {
        Node tmp;
        tmp = top;
        int count = 0;
        while(tmp != null) {
            count++;
            tmp = tmp.getNext();
        }
        return count;
    }
    public boolean isEmpty() {
        return top==null;
    }
    public void print() {
        System.out.print("Stack: ");
        Node tmp;
        for(tmp=top;tmp!=null;tmp=tmp.getNext()) {
            System.out.print(tmp.getData());
        }
    }
}
