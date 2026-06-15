import java.util.*;
public class Switch0
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fruit=sc.next();
        switch(fruit)
        {
            case "apple":
            System.out.println("red apple");
            break;
            case "mango":
            System.out.println("yellow fruit");
            break;
            case "banana":
            System.out.println("yellow fruit");
            break;
            case "grapes":
            System.out.println("green colour");
            break;
            default:
            System.out.println("invalid option");
        }
    }
}