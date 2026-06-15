import java.util.*;
public class Numbervisible {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%5==0&&number%11==0){
            System.out.println("number divisible"+number);
        }
        else{
            System.out.println("number not divisible"+number);
        }
    }
    
}
