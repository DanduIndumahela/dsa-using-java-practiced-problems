import java.util.*;
public class Switcho {
    public static void main(String srgs[]){
        System.out.println("enter names");
        Scanner sc=new Scanner(System.in);
        String names=sc.next();
        switch(names){
            case "hi"-> System.out.println("name starts with h");
            case "oi"-> System.out.println("name starts with o");
            case "bi"-> System.out.println("name starts with b");
            case "gi"-> System.out.println("name starts with g");
            case "yi"-> System.out.println("name starts with y");
            default -> System.out.println("wrong names");

        }
    }
    
}
