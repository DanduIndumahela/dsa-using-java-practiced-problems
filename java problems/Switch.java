import java.util.*;
public class Switch {
    public static void main(String args[])
    {
        System.out.println("enter names");
        Scanner sc=new Scanner(System.in);
        String names=sc.next();
        switch(names){
            case "hi":
                System.out.println("name starts with H");
                break;
            case "oi":
                System.out.println("name starts with O");
                break;
            case "bi":
                System.out.println("name starts with B");
                break;
            case "vi":
                System.out.println("name starts with V");
                break;
            default:
                System.out.println("wrong name");
        }
    }    
}
