/*Build Array from Permutation */
/*import java.util.*;
public class Permutation{
    public static void main(String[] args) {
        int[] nums={0,2,1,5,3,4};
        int []result=numbers(nums);
        System.out.println(Arrays.toString(result));
    }
    static int[] numbers(int[] arr){
        int n=arr.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }

}*/
import java.util.*;
public class Permutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
        num[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=num[num[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
}