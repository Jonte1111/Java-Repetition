public class Queue<T> {
    Object[] q;
    int max;
    int size;
    public Queue(int max) {
        this.max = max;
        q = new Object[max];
        size = 0;
    }
    public void enqueue(T item) throws QException{
        if(exists(item)) 
            throw new QException("Elementet finns redan i kön");
        else
            q[size++] = item;
    }
    public boolean exists(T item) {
        for(int i = 0; i < size; i++) {
            if(q[i] == item) 
                return true;
        }
        return false;
    } 
    public T dequeue() throws QException{
        T tmp;
        if(size == 0)
            throw new QException("Kön är tom");
        else {
            tmp = (T)q[0];
            for(int i = 0;i < size -1;i++) {
                q[i] = q[i+1];
            }
            size--;
            return tmp;
        }
    }
    public T peek() throws QException{
        if(size == 0)
            throw new QException("Kön är tom");
        else {
            return (T)q[0];
        }
    }
    public int size() {
        return size;
    }
}
