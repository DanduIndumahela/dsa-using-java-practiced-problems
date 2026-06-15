import java.util.*;
public class AreaofEquilateraltriangle {
    public static void main(String[] args) {
        System.out.println("enter a side of a equilateral triangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        double length=sc.nextDouble();
        double area=Math.sqrt(3)/4*length*length;
        System.out.println(area);
    } 
}
