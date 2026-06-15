import java.util.*;
public class Largestnumberinfunctions {
    public static void main(String[] args) {
        System.out.println("enter three numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("enter third number");
        int c=sc.nextInt();
        System.out.println("largest number is:");
        System.out.println(max(a,b,c));
        System.out.println("smallest number is:");
        System.out.println(min(a,b,c));
    }
    static int max(int a,int b,int c){
        int largest;
        if(a>=b && a>=c){
            return largest=a;
        }
        else if(b>=a && b>=c){
            return largest=b;
        }
        else{
            return largest=c;
        }

    }
    static int min(int a,int b,int c){
        int smallest;
        if(a<=b && a<=c){
            return smallest=a;
        }
        else if(b<=a && b<=c){
            return smallest=b;
        }
        else {
            return smallest=c;
        }
    }
    
}
//////////above logic wont work if there are equal number;
//so we can use this
////static int maximum(int a,int b,int c){
////Syso(math.max(a,math.max(b,c))) }
////static int minimum(int a,int b,int c){
////Syso(math.min(a,math.min(b,c))) }