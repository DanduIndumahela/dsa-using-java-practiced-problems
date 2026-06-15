/*238. Product of Array Except Self*/
import java.util.*;
public class Productofarrayexceptself {
   public static void main(String[] args) {
   int [] result={1,2,3,4};
   excetself(result);
   int [] output=excetself(result);
   System.out.println(Arrays.toString(output));
   }
   public static int[] excetself(int[] nums){
      int n=nums.length;
      int [] ans=new int[n];
      for(int i=0;i<n;i++){
         int product=1;
         for(int j=0;j<n;j++){
            if(i!=j){
               product=product*nums[j];
            }
         }
         ans[i]=product;
      }
      return ans;
   }
}
/*class Solution {
   public int[] productExceptSelf(int[] nums) {
      int n = nums.length;
      int[] ans = new int[n];

        // Step 1: Compute prefix products
      int prefix = 1;
      for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
      }

        // Step 2: Compute suffix products and multiply with prefix
      int suffix = 1;
      for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
      }

      return ans;
   }
}
*/