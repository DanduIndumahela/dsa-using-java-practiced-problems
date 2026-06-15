import java.util.*;
public class Sumofnumbers {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        for(int i=0;i<number;i++){
            //System.out.println(i);
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
