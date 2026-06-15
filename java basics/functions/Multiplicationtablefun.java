package basics.functions;
import java.util.*;
public class Multiplicationtablefun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(number);
        table(number);

    }
    static void table(int number){
        for(int i=1;i<=10;i++){
            int total=number*i;
            System.out.println(number + " * " + i + " = " + total);
        }

    }
}
