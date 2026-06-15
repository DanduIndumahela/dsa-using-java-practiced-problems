package Linkedlist;

public class Insertrecursion {
    private Node head;
    private Node tail;
    private int size;

    public Insertrecursion() {
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

    public void insertrecur(int value, int index) {
        if (index < 0 || index > size) { // ✅ boundary check
            System.out.println("Invalid index: " + index);
            return;
        }

        head = insertrecur(value, index, head);
    }

    private Node insertrecur(int value, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertrecur(value, index - 1, node.next); // ✅ fixed decrement
        return node; // ✅ added return statement
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

    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) { // ✅ fixed constructor
            this.value = value;
            this.next = next;
        }
    }
}// Main present in supporte.java file
