package basics.functions;
import java.util.*;
public class Sumfun0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int total= sum(a,b);
        System.out.println(total);
        System.out.println(sum(a,b));

    }
    static int sum(int a,int b){
        return a+b;
    }
    
}
