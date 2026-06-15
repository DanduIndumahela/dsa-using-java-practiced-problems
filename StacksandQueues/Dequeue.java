package StacksandQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.addFirst(8);
        deque.addLast(9);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.remove());
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
