package arrays;
import java.util.*;
public class Arrayusingforloopint {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[6];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    //for(int i=0;i<arr.length;i++){
    //System.out.print(arr[i] + " ");
      //  }
    //System.out.println(Arrays.toString(arr));
    for(int num:arr){
        System.out.print(num + " ");
        }
    }
}
