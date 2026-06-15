import java.util.*;
public class Palindromee {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rev=0;
        while(number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;
        }
        System.out.println(rev);
        if(number==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
