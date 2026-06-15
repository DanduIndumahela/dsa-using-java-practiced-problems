import java.util.*;
public class Volumeofcone {
    public static void main(String args[]){
        System.out.println("enter radius and height");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter radius");
        double radius=sc.nextDouble();
        System.out.println("enter height");
        double height=sc.nextDouble();
        volume(radius,height);
    }
    static void volume(double radius,double height){
        double ans=(1.0/3)*Math.PI*radius*radius*height;
        System.out.println(ans);
    }
}
