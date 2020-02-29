public class QueueArray implements Queue {
    private Object arr[];
    private int f;
    private int r;
    public int N;
    public QueueArray(int capacity){
        arr = new Object[capacity];
        f = 0;
        r = 0;
        N = capacity;
    }
    @Override
    public int size() {
        return ((N-f+r)%N);
    }
    @Override
    public boolean isEmpty() {
        return (f==r);
    }
  public boolean isFull(){
      return (r==N) 
    } 
    @Override
    public void enqueue(Object e) {
        if(isFull()){
            System.out.println("The queue is full");
        }
        else
           arr[r] = e;
           r = ((r+1)%N);
           r++;
    }
    @Override
    public Object dequeue() {
        Object temp=null;
        if(isEmpty()){
            System.out.print("The Queue is empty");
        }
        else
            temp = arr[f];
            arr[f]=null;
            f = ((f+1)%N);
        return temp;
    }
    @Override
    public Object front() {
        return arr[f];
    }
    @Override
    public void display() {
       for(int i = 0;i<f;i++){
           System.out.print(arr[i]+" ");
       }
    }
}
