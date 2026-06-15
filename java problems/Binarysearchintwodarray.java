import java.util.Scanner;

public class Binarysearchintwodarray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 16;

        int found = binarysearch(arr, target);
        System.out.println("Target found? " + found);
    }
    static int binarysearch(int[][] arr,int target){
        int rows = arr.length;
        int cols = arr[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while(start<end){
            int mid=start+(end-start)/2;
            for(int i=0;i<end;i++){
                for(int j=0;j<end;j++){
                    if(mid<target){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
            }
        }
        return -1;
    }
    
}
