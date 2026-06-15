package Linkedlist;

public class Doublelinkedlist {
    Node head;

    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertend(int value) {
        Node node = new Node(value);
        Node last = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.value + "-->>");
            last = node;
            node = node.next;
        }
        System.out.println("ennd");
        while (last != null) {
            System.out.print(last.value + "-->>");
            last = last.prev;
        }
        System.out.println("start");
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insert(int after, int value) {
        Node pe = find(after);
        if (pe == null) {
            System.out.println("element does not exist");
            return;
        }
        Node node = new Node(value);
        node.next = pe.next;
        pe.next = node;
        node.prev = pe;
        if (node.next != null) {
            node.prev.next = node;
        }
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
