import java.util.*;
public class Mathemarical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter operators");
        String op=sc.next();
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        if(op.equals("*")){
            System.out.println("result"+(a*b));
        }
        else if(op.equals("-")){
            System.out.println("result"+(a-b));
        }
        else if(op.equals("+")){
            System.out.println("result"+(a+b));
        }
        else if(op.equals("/")){
            System.out.println("result"+(a/b));
        }
        else{
            System.out.println("wrong operator");
        }
    }
}