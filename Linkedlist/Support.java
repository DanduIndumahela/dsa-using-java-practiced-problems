/*package Linkedlist;


public class Support {
    public static void main(String[] args) {
        // Singlelistt list = new Singlelistt();
        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);
        // list.display();
        /*
         * Doublelinkedlist list = new Doublelinkedlist();
         * list.insertfirst(1);
         * list.insertfirst(2);
         * list.insertfirst(3);
         * list.insertfirst(4);
         * list.insertend(8);
         * list.insertend(9);
         * list.insert(9, 99);
         */ /*
                  * list.insertfirst(1);
                  * list.insertfirst(2);
                  * list.insertfirst(3);
                  * list.insertfirst(4);
                  * list.display();
                  */
// list.display();
/*  Circularlist list = new Circularlist();
    list.insertvalue(1);
    list.insertvalue(2);
    list.insertvalue(3);
    list.insertvalue(4);
    list.insertvalue(99);
    list.insertvalue(88);
    list.insertvalue(89);
    list.insertvalue(98);
    list.display();
    list.deletelist(98);
    list.deletelist(89);
    list.display();
}
}
package Linkedlist;

public class Support {
    public static void main(String[] args) {
        Mergelist list1 = new Mergelist();
        list1.inserten(1);
        list1.inserten(2);
        list1.inserten(3);
        list1.inserten(4);
        Mergelist list2 = new Mergelist();
        list2.inserten(11);
        list2.inserten(12);
        list2.inserten(13);
        list2.inserten(14);
        Mergelist merged = Mergelist.merge(list1, list2);
        merged.display();
    }
}
package Linkedlist;

public class Support {
    public static void main(String[] args) {
        // Create linked list nodes
        ListNode first = new ListNode();
        first.value = 1;
        ListNode second = new ListNode();
        second.value = 2;
        ListNode third = new ListNode();
        third.value = 3;

        // Link the nodes
        first.next = second;
        second.next = third;
        third.next = second; // creates a cycle (2 -> 3 -> 2)

        // Check cycle length
        Cyclelength obj = new Cyclelength();
        int result = obj.cycle(first);

        if (result > 0) {
            System.out.println("Cycle detected with length: " + result);
        } else {
            System.out.println("No cycle found.");
        }
    }
}*/
package Linkedlist;

public class Support {
    public static void main(String[] args) {
        ListNode first = new ListNode();
        first.value = 1;
        ListNode second = new ListNode();
        second.value = 2;
        ListNode third = new ListNode();
        third.value = 3;
        ListNode fourth = new ListNode();
        fourth.value = 4;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // 🔁 cycle starts at node 2

        Startofcycle obj = new Startofcycle();
        ListNode start = obj.cycle(first);

        if (start != null) {
            System.out.println("Cycle starts at node with value: " + start.value);
        } else {
            System.out.println("No cycle found.");
        }
    }
}
