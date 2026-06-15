import java.util.Arrays;
public class Searchintwodarray {
        public static void main(String[] args) {
        int [] [] arr={
            {1,2,8},
            {4,3,9},
            {6,99,88}
        };
        int target=88;
        int [] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int [] [] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int coll=0;coll<arr[row].length;coll++){
                if(arr[row][coll]==target){
                    return new int [] {row, coll} ;
                }
            }
        }
        return new int [] {-1, -1} ;
    }
}   