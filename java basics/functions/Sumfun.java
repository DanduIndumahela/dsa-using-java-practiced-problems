package basics.functions;
import java.util.*;
public class Sumfun {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sum(a,b);     
    }
    static void sum(int a,int b){
        int total=a+b;
        System.out.println(total);
    }   
}
