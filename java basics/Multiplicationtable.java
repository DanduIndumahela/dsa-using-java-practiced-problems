package basics;
import java.util.*;
public class Multiplicationtable {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    for(int i=1;i<=10;i++){
        //System.out.println(i);
        int result=number*i;
        //System.out.println(result);
        System.out.println(number + " x " + i + " = " + result);
        }
    }
}
