package Sorting;

import java.util.Arrays;

public class Cyclicfindmissing{
    public static void main(String[] args) {
    int[] arr = {4, 0, 2, 1, 3, 6};
    int missing = cyclicsort(arr);  // capture return value
    System.out.println("Missing number is: " + missing); // print missing number
    }
    static int cyclicsort(int []arr){
        int i=0;
        while(i<arr.length){
            int correctindex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctindex]) {
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
}
