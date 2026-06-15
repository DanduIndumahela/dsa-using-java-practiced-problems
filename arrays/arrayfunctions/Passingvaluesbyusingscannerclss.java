package arrayfunctions;
import java.util.*;
public class Passingvaluesbyusingscannerclss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        change(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void change(int[] nums){
        nums[5]=99;
        }
}
