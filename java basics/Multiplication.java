import java.util.*;
public class Multiplication {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            product=n*i;
            System.out.println(n + " * " + i + " = " + product);
        }
    }
    
}
