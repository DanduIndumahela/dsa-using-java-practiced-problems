import java.util.*;

public class Methodoverloading {
    public static void main(String[] args) {
        fun(99);
        fun("kunal");
        
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
