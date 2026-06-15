import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(8);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        list.add(120);
        list.add(130);
        list.add(140);
        System.out.println(list.contains(80));
        System.out.println(list);
        list.set(9, 128);
        System.out.println(list.remove(10));
        System.out.println(list);
    }
    
}
