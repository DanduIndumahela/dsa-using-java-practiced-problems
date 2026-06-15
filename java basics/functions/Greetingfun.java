package basics.functions;
import java.util.*;
public class Greetingfun{
    public static void main(String[] args) {
        System.out.println("eneter name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        guestname(name);
    }
    static void guestname(String name){
        System.out.println("Hello, " + name + "! Welcome!");
    }
}
