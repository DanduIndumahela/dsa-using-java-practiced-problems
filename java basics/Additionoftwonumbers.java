import java.util.*;
public class Additionoftwonumbers {
    public static void main(String []args){
       //addition of two numbers 
        System.out.println("enter a and b values");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        if(a<=0 ||b<=0){
            System.out.println("enter positve number");
        }
        else{
            int sum=a+b;
            System.out.println(sum);
        }
    }
}
