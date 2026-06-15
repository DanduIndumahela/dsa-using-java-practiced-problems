package Recursion;

public class Simplehi {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("hi");
        message1();
    }
    static void message1(){
        System.out.println("hi");
        message2();
    }
    static void message2(){
        System.out.println("hi");
        message3();
    }
    static void message3(){
        System.out.println("hi");
        message4();
    }
    static void message4(){
        System.out.println("hi");
        message8();
    }
    static void message8(){
        System.out.println("hi");
    }
}
