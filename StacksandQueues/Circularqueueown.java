package StacksandQueues;

public class Circularqueueown {
    public static void main(String[] args) throws Exception {
        Circularqueue queue = new Circularqueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.display();
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.display();
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.display();
    }
}
