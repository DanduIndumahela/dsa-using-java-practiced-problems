/*package Linkedlist;

public class Supporte {
    public static void main(String[] args) {
        // Deletelist list = new Deletelist(); // ✅ Correct class name

        // Insert elements at the tail (end)
        // list.inserten(1);
        // list.inserten(2);
        // list.inserten(3);
        // list.inserten(4);
        // list.inserten(1);
        // list.inserten(2);
        // list.inserten(3);
        // list.inserten(4);

        // list.insertindex(6, 6); // Inserts 6 at index 8
        // list.display();

        //// System.out.println("deleted value" + list.deletefirst());
        // System.out.println("deleted value" + list.deletelastelement());
        // list.deletelastelement();
        // list.deleteindex(6);
        // list.deleteindex(5);
        // list.display();
        Insertrecursion list = new Insertrecursion();
        list.insertrecur(99, 0);
        list.insertrecur(8, 1);
        list.insertrecur(9, 2);
        list.insertrecur(8, 3);
        list.insertrecur(99, 4);
        // list.display();
        // list.insertrecur(8, 3);
        // list.insertrecur(8, 4);
        list.display();
    }
}*/
package Linkedlist;

public class Supporte {
    public static void main(String[] args) {
        Insertrecursion list = new Insertrecursion();

        // Add elements with duplicates NEXT to each other
        list.insertrecur(1, 0);
        list.insertrecur(1, 1);
        list.insertrecur(2, 2);
        list.insertrecur(3, 3);
        list.insertrecur(3, 4);
        list.insertrecur(4, 5);
        list.insertrecur(4, 6);

        System.out.println("Before removing duplicates:");
        list.display();

        list.duplicates();

        System.out.println("After removing duplicates:");
        list.display();
    }
}
