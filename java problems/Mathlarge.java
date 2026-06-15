import java.util.*;
public class Mathlarge {
    public static void main(String args[]){
        System.out.println("enter a,b,c");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(c,Math.max(a,b));
        System.out.println("maximum value is:" + max);
    }    
}
