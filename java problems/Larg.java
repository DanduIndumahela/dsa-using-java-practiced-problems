import java.util.Scanner;
public class Larg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;

        }
        System.out.println("maximum"+max);
        

    }
}