package Linkedlist;

public class Startofcycle {

    public ListNode cycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        // Step 1: Detect the cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // calculate the cycle length
                length = getCycleLength(slow);
                break;
            }
        }

        // Step 2: if there is no cycle
        if (length == 0) {
            return null;
        }

        // Step 3: find the start of the cycle
        ListNode first = head;
        ListNode second = head;

        // move second pointer ahead by 'length' steps
        while (length > 0) {
            second = second.next;
            length--;
        }

        // move both pointers until they meet at the cycle start
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first; // ✅ this node is the start of the cycle
    }

    // helper to find cycle length
    private int getCycleLength(ListNode node) {
        ListNode temp = node;
        int length = 0;

        do {
            temp = temp.next;
            length++;
        } while (temp != node);

        return length;
    }
}

class ListNode {
    int value;
    ListNode next;
}
