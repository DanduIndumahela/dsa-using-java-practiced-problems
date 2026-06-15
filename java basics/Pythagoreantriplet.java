/*Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
*/
import java.util.*;
public class Pythagoreantriplet {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(pythagreantripet(a,b,c));
    }
    static boolean pythagreantripet(int x,int y,int z){
        int max=Math.max(x,Math.max(y,z));
        int a,b,c;
        if (max == x) {
            c = x; a = y; b = z;
        } else if (max == y) {
            c = y; a = x; b = z;
        } else {
            c = z; a = x; b = y;
        }
        return(a*a+b*b)==(c*c);
    }
    
}
