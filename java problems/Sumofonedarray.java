/*Running Sum of 1d Array*/
/*import java.util.*;
public class Sumofonedarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}*/
import java.util.*;
public class Sumofonedarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println(sumarray(arr));
    }
    static int sumarray(int[]nums){
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
}



