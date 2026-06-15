package StacksandQueues;

import java.util.Stack;

public class Stackown {
    public static void main(String[] args) throws Exception {
        // Ownstack stack = new Ownstack(5);
        // Stackdynamic stack = new Stackdynamic();
        Ownstack stack = new Stackdynamic();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
