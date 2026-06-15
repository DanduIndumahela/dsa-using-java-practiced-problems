package Linkedlist;

public class Singlelistlast {
    private Node head;
    private Node tail;
    private int size;

    public Singlelistlast() {
        this.size = 0;
    }

    // Insert at the beginning (head)
    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the end (tail)
    public void inserten(int val) {
        // If list is empty, use insert() to create first node
        if (tail == null) {
            insert(val);
            return; // ✅ added return to stop execution after inserting
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("end");
    }

    // Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
