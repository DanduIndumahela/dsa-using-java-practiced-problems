import java.util.*;
public class Reverse0
{
    public static void main(String args[])
    {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n>0)
        {
            int rev=n%10;
            n=n/10;
            ans=ans*10+rev;

        }
        System.out.println(ans);
        

    }
}