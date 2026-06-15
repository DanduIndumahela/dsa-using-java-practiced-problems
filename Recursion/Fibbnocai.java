package Recursion;

public class Fibbnocai {
    public static void main(String[] args) {
        int ans=fibbnocai(6);
        System.out.println(ans);
    }
    static int fibbnocai(int n){
        if(n<2){
            return n;
        }
        return fibbnocai(n-1)+fibbnocai(n-2);
    }
}
