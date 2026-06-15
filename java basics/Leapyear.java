package basics;
import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
    System.out.println("enter a year");
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    if((year%4==0&&year%100!=0)||(year%400==0)){
        System.out.println("leap year"+year);
    }
    else{
        System.out.println("not leap year"+year);
        }
    }
}
