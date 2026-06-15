import java.util.*;
public class Volumeofcylinder {
    public static void main(String[] args) {
        System.out.println("enter radius and height");
        Scanner sc=new Scanner(System.in);
        double radius=0; double height=0;
        while(radius<=0){
            System.out.println("enter radius");
            radius=sc.nextDouble();
            if(radius<=0){
                System.out.println("enter positive number");
            }
        }
        while(height<=0){
            System.out.println("enter a radius");
            height=sc.nextDouble();
            if(height<=0){
                System.out.println("enter positve number");
            }
        }
        double ans=Math.PI*radius*radius*height;
        System.out.println(ans);
    }
    
}
