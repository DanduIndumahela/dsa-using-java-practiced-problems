import java.util.*;
public class Volumeofprism {
    public static void main(String args[]){
        System.out.println("enter basearea and height");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter basearea");
        double basearea=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        double ans=volume(basearea,height);
        System.out.println(ans);
    }
    static double volume(double basearea,double height){
        return basearea*height; 
    }
}
