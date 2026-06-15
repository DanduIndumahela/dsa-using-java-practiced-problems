import java.util.*;
public class Primefun{
    static boolean prime( int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=2){
            if(n%c==0){
                return false;

            }
            c++;
            
        }
        if(c*c>n){
            return true;
        }
        return false;
    } 
    public static void main(String args[]){
        System.out.println("enter an number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);

    }   

}