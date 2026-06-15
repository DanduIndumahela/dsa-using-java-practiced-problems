import java.util.*;

public class Scopingloop {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name="kunal";
        {
            a=99;
            System.out.println(a);
            int c=88;
            System.out.println(c);
        }
        int c=89066;
        System.out.println(a);
        System.out.println(name);
        for(int i=0;i<4;i++){
            System.out.println(i);
        }
    }
    
}
