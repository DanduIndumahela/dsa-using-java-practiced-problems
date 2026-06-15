package arrayfunctions;
import java.util.*;
public class Passinginfunctions {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[5]=99;
        //System.out.println(arr);
    }
    
}
