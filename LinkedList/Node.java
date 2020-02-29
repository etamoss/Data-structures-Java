public class Node {

    private String data;
    private Node next;

    private int quantity;

    public Node(){
        data = null;
        next = null;
    }

    public Node(String d,Node n,int q){
        data = d;
        next = n;
        quantity = q;
    }

    public String getData(){
        return data;
    }
    public void setData(String d){
        data = d;

    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node n){
        next = n;
    }
}
