package basics.functions;
import java.util.*;
public class Simpleinterestfun {
    public static void main(String[] args) {
        System.out.println("enter number of principal,time,rate");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal");
        int principal=sc.nextInt();
        System.out.println("enter time");
        float time=sc.nextFloat();
        System.out.println("enter rate");
        int rate=sc.nextInt();
        simpleinterest(principal,time,rate);
    }  
    static void simpleinterest(int principal,float time,int rate){
        float SI=(principal*time*rate)/100;
        System.out.println(SI);
    }
}
