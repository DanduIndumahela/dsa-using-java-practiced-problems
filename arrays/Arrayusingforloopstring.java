package arrays;
import java.util.*;
public class Arrayusingforloopstring {
    public static void main(String[] args) {
        //array of objects
        Scanner sc=new Scanner(System.in);
        String arr[]=new String[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.next();
        }
        //for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i] + " ");
       // }
        System.out.println(Arrays.toString(arr));
        //modifying strings
        arr[0]="hi";
        System.out.println(Arrays.toString(arr));
        
    }
}
