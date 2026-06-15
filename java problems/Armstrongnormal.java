import java.util.*;
public class Armstrongnormal {
    public static void main(String[] args) {
        System.out.println("enter armstrong number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int original=n;
        int original=n;
        int sum=0;
        
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem;
            //System.out.println(rem);

        }  
        if(original==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("noarmstron");

        }
        
    }   
}
