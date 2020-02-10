public class QueueArray implements Queue {

    private Object arr[];
    private int f;
    private int r;
    public int size;

    public QueueArray(int capacity){
        arr = new Object[capacity];
        f = 0;
        r = 0;
        size = capacity;
    }

    @Override
    public int size() {
        return ((size-f+r)%size);
    }

    @Override
    public boolean isEmpty() {
        return (f==r);
    }

    @Override
    public void enqueue(Object e) {
        if(size() == (size-1)){
            System.out.println("The queue is full");
        }
        else
            arr[r] = e;
            r = ((r+1)%size);
    }

    @Override
    public Object dequeue() {
        Object temp=null;

        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else
            temp = arr[f];
        arr[f]=null;
            f = ((f+1)%size);
        return temp;
    }

    @Override
    public Object front() {
        return arr[f];
    }

    @Override
    public void display() {
       for(int i = 0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
