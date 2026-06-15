//*1672. Richest Customer Wealth*/
import java.util.*;
public class Customerwaalth {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]nums =new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=sc.nextInt();
            }   
            System.out.println(Arrays.toString(nums[i]));
        }
        int maximumvalue=maximum(nums);
        System.out.println(maximumvalue);
    }
    static int maximum(int [][] arr){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum=arr[i][j]+sum;
            }
            if (sum > ans) {/*instend of if we can use ans=math.max(ans,sum) */
                ans = sum;
            }

        }
        return ans;
    }
    
}
