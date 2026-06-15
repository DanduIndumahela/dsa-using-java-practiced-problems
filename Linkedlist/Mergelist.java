package Linkedlist;

import java.util.LinkedList;

public class Mergelist {
    private Node head;
    private Node tail;
    private int size;

    public Mergelist() {
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

    public static Mergelist merge(Mergelist first, Mergelist second) {
        Node fi = first.head;
        Node se = second.head;
        Mergelist anss = new Mergelist();
        while (fi != null && se != null) {
            if (fi.value < se.value) {
                anss.inserten(fi.value);
                fi = fi.next;
            } else {
                anss.inserten(se.value);
                se = se.next;
            }
        }
        while (fi != null) {
            anss.inserten(fi.value);
            fi = fi.next;
        }
        while (se != null) {
            anss.inserten(se.value);
            se = se.next;
        }
        return anss;
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("endd");
    }

    // Inner Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}// Main present in support.java file
