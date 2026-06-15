package basics;
import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        System.out.println("enter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("hello!"+ name + " " +"welcome");
    } 
}
