package basics.functions;
import java.util.*;
public class Leapyearfun {
    public static void main(String[] args) {
        System.out.println("enter a year");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        year(a);
    
    }
    static void year(int a){
        if((a%4==0&&a%100!=0)||(a%400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
    }
}
    

