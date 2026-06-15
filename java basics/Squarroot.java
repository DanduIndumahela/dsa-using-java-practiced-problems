import java.util.*;
public class Squarroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(square(x));
    }
    static int square(int x){
        int low=1;
        int high=x/2;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid<=x/mid){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}
