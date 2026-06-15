package StacksandQueues;

public class Queueown {
    public static void main(String[] args) throws Exception {
        Ownqueue queue = new Ownqueue(6);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(8);
        queue.insert(9);
        queue.display();
        queue.remove();
        queue.remove();
        queue.display();
    }
}
