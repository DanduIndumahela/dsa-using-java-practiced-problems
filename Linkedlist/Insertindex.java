package Linkedlist;

public class Insertindex {
    private Node head;
    private Node tail;
    private int size;

    public Insertindex() {
        this.size = 0;
    }

    public void insertindex(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index: " + index);
            return;
        }
        if (index == 0) {
            insert(value);
            return;
        }
        if (index == size) {
            inserten(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
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
