package Recursion;
public class Printnumbers {
    public static void main(String[] args) {
        main(5);
        /*main(5);
    }
    static void main(int n){
        System.out.println(n);
        if(n==1){
            return;
        }
        //System.out.println(n);
        main(n-1);*/

    }
    static void main(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        main(n-1);
    }
}
