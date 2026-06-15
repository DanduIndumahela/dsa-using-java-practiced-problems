import java.util.*;
public class Printnumbers {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println(i);
        }
    }
    
}
