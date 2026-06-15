package Recursion;

public class Nnumbers {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        System.out.println(n);
        print1(2);
    }
    static void print1(int n){
        System.out.println(n);
        print2(3);
    }
    static void print2(int n){
        System.out.println(n);
        print3(4);
    }
    static void print3(int n){
        System.out.println(n);
        print4(8);
    }
    static void print4(int n){
        System.out.println(n);
        print8(9);
    }
    static void print8(int n){
        System.out.println(n);
    }
}
