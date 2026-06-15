package OOPs;

public class Main1 {
    public static void main(String[] args) {
        Boxweight box3 = new Boxweight(); // default constructor
        Boxweight box4 = new Boxweight(1, 2, 3, 4); // 4-argument constructor
        Inheritance boxx = new Boxweight();
        System.out.println(boxx.length + " " + boxx.height + " " + boxx.width);
        System.out.println(boxx.length + " " + boxx.height + " " + boxx.width);
        System.out.println(boxx.length + " " + boxx.height + " " + boxx.width);
        System.out.println(box3.height + " " + box3.weight);
        System.out.println(box4.height + " " + box4.weight);

        System.out.println(box3.height + " " + box3.weight);
        System.out.println(box4.height + " " + box4.weight);
    }
}
