package basics;
import java.util.*;
public class Sumfunction {
    public static void main(String args[]){
        sum();
        sum();
    }
            static void sum(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter first number");
            int num1=sc.nextInt();
            System.out.println("enter second number");
            int num2=sc.nextInt();
            int sum=num1+num2;
            System.out.println("sum of two numbers" +sum);
    }   
}
