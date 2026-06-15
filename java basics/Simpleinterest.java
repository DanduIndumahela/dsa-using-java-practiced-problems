package basics;
import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        System.out.println("enter principal,time,rate");
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter principal");
        int principal=sc.nextInt();
        System.out.println("enter time");
        float time=sc.nextFloat();
        System.out.println("enter rate");
        int rate=sc.nextInt();
        float simpleinterest=((principal*time*rate)/100);
        System.out.println(simpleinterest);
    }
}
