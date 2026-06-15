import java.util.*;
public class Count {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        if(count==0);
        if(number==0){
            System.out.println("print count=1");
        }
        for(int i=number;i!=0;i/=10){
            count++;
        }
        System.out.println(count);
    }
    
}
