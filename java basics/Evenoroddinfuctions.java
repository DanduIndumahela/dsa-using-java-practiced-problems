
import java.util.*;
public class Evenoroddinfuctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(evenorodd(num));
    }
    static String evenorodd(int num){
        if(num%2==0){
            return "even";
        }else{
            return "odd";
        }
    }
    
}


