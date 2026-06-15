
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));

    }
    static int factorial(int n){
        if(n!=1 ||n!=0){
            return 1;
        }
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}
