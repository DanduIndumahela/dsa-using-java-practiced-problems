import java.util.*;
public class Areaoftriangle {
    public static void main(String []args){
        System.out.println("enter length and breadth");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a breadth");
        double breadth=sc.nextDouble();
        System.out.println("enter a length");
        double length=sc.nextDouble();
        if(breadth>0 && length>0){
        double areaoftriange=0.5*breadth*length;
        System.out.println(areaoftriange);
        }
    }
    
}
