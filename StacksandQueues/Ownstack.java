package StacksandQueues;

//import Exception.Exception;

public class Ownstack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int pttr = -1;

    public Ownstack(int size) {
        this.data = new int[size];
    }

    public Ownstack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is the full");
            return false;
        }
        pttr++;
        data[pttr] = item;
        return true;
    }

    public boolean isFull() {

        // if(pttr==data.length-1){
        // System.out.println("pttr in last index");
        // return true;
        // }
        return pttr == data.length - 1;
        // return false;
    }

    public boolean isEmpty() {
        return pttr == -1;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop");
        }
        int removed = data[pttr];
        pttr--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("it is the empty");
        }
        return data[pttr];
    }
}
