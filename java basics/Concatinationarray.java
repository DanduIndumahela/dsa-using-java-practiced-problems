/*Concatenation of Array */
import java.util.*;
public class Concatinationarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] result= concatenation(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] concatenation(int[] arr){
        int n=arr.length;
        int []ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
            ans[i+n]=arr[i];
        }
        return ans;
    }
}
