import java.util.*;
public class Perimeterofrectangle {
    public static void main(String[] args) {
        System.out.println("enter length and breadth");
        Scanner sc=new Scanner(System.in);
        double length=0;
        double breadth=0;
        while(length<=0){
            System.out.println("enter length value");
            length=sc.nextDouble();
            if(length<=0){
                System.out.println("enter positive length");
            }
        }
        while(breadth<=0){
            System.out.println("enter breadth value");
            breadth=sc.nextDouble();
            if(breadth<=0){
                System.out.println("enter positive value");
            }
        }
        double ans=2*length+breadth;
        System.out.println(ans);
    }
    
}
