/*1365. How Many Numbers Are Smaller Than the Current Number*/
import java.util.*;
public class Smallerthancurrentnumber {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
           // System.out.print(nums[i]);
        }
        int []ans=smaller(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] smaller(int []arr){
        int []result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
}
