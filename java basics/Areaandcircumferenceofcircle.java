import java.util.*;
public class Areaandcircumferenceofcircle {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double radius=sc.nextDouble();
    System.out.println("area oof a circle");
    System.out.println(area(radius));
    System.out.println("circumference of a circle");
    System.out.println(circumference(radius));

    }
    static double area(double radius){
        return Math.PI*radius*radius;
    }
    static double circumference(double radius){
        return 2*Math.PI*radius;
    }
}
