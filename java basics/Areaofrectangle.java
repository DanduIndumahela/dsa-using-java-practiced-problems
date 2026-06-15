import java.util.*;
public class Areaofrectangle {
    public static void main(String []args){
        double length=9.0;
        double breadth=8.0;
        double ans=area(length,breadth);
        System.out.println(ans);


    }
    static double area(double length,double breadth){
        return length*breadth;
    }
}
