package Linkedlist;

public class Deletelist {
    private Node head;
    private Node tail;
    private int size;

    public Deletelist() {
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

    public int deletefirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // ✅ Fixed get() method
    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteindex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index: " + index);
            return -1;
        }
        if (index == 0) {
            return deletefirst();
        }

        if (index == size - 1) {
            return deletelastelement();
        }
        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    // ✅ Correct deletelastelement() method
    public int deletelastelement() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public void inserten(int val) {
        if (tail == null) {
            insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("end");
    }

    // ✅ Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
