public class Shadowingg {
    static int x=99;
    public static void main(String[] args) {
        System.out.println(x);  
        int x=88;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }  
}
