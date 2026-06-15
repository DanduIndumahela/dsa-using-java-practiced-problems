import java.util.*;
public class Areaofparallelogram {
    public static void main(String[] args) {
        System.out.println("enter base and height");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a base");
        double base=sc.nextDouble();
        System.out.println("enter a height");
        double height =sc.nextDouble();
        parallelogram(base,height);
    }
    static void parallelogram(double base,double height){
        double area=base*height;
        System.out.println(area);
    }
    
}
