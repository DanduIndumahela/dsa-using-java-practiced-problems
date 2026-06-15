/*75. Sort Colors*/
import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        for(int i=index;i<n;i++){
            if(nums[i]==1){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
