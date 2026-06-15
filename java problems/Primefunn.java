import java.util.Scanner;
public class Primefunn{
        public static void main(String args[]){
           // System.out.println("enter a number");
            Scanner in =new Scanner(System.in);
            int n=in.nextInt();
            boolean ans=prime(n);
            System.out.print(ans);

        }
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
}