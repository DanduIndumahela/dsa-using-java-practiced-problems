import java.util.*;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibonacci series");
        for(int i=2;i<=n;i++){
            System.out.print(a);
            int nextterm=a+b;
            a=b;
            b=nextterm;
            //System.out.println(a);
        }

    }
    
}
