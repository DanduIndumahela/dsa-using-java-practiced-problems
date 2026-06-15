import java.util.*;
public class Areaofcircle{
    public static void main(String []args){
        System.out.println("enter radius");
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        if(radius>0){
            double area=Math.PI*Math.pow(radius,2);
            System.out.println(area);  
        }
        else{
            System.out.println("invalid");
        }

    }
}