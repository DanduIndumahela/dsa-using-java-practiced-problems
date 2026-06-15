import java.util.*;
public class Varmethodoverloading {
    public static void main(String[] args) {
        demo(1,2,3,4);
        demo("kunal","rahul");
        
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }

}
