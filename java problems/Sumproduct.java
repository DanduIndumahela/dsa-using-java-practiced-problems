import java.util.*;
public class Sumproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int sum=0;
        int product=1;
        while(number>0){
            int digit=number%10;
            sum=sum+digit;
            product=product*digit;
            number=number/10;
        }
        int anss=product-sum;
        System.out.println(anss);
    }
}