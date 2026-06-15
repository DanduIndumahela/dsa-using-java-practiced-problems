package basics;
import java.util.*;
public class Hcfandlcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int originalA = a;
        int originalB = b;
        while(b!=0){
            int temp=a;
            a=b;
            b=temp%b;
        }
        System.out.println(a);
        int lcm = (originalA * originalB) / a;
        System.out.println(lcm);
        
    }
}
