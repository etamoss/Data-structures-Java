import  java.util.Scanner;
public class QueueArrayDemo {

    public static void main(String[]args){

        QueueArray q1 = new QueueArray(10);

        Scanner scanner = new Scanner(System.in);


       q1.enqueue("j");
        q1.enqueue("0");
        q1.enqueue("e");
        q1.enqueue("l");
        q1.enqueue("k");
        q1.enqueue("a");
        q1.enqueue("n");
        q1.enqueue("y");
        q1.enqueue("i");
        /*q1.enqueue("w");*/

        System.out.println(q1.size());
        //q1.display();


        System.out.println(q1.dequeue());
        //System.out.println(q1.front());
       // q1.enqueue(45);
       q1.enqueue(44);
        q1.display();
        /*System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        /*System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());*/

        //System.out.println(q1.isEmpty());
       // System.out.println(q1.size());
        //q1.display();
    }
}
