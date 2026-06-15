package Linkedlist;

public class Circularlist {
    private Node head;
    private Node tail;

    public Circularlist() {
        this.head = null;
        this.tail = null;
    }

    public void insertvalue(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        if (node != null) {
            do {
                System.out.print(node.value + "-->>");
                node = node.next;
            } while (node != head);
        }
        System.out.println("head");
    }

    public void deletelist(int value) {
        Node node = head;
        if (head == null) {
            return;
        }
        if (node.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node vall = node.next;
            if (vall.value == value) {
                node.next = vall.next;
                break;
            }
            node = node.next;
        } while (node.next != head);
        // System.out.println("deleted item");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
