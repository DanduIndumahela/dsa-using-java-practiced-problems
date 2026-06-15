import java.util.*;
public class Reverse {
    public static void main(String []args){
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number==0){
            System.out.println("enter a number");
        }
        for(;number!=0;number/=10){
            int digit=number%10;
            System.out.print(digit);
        }
    }
}
