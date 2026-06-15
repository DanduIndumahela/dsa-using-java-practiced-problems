package Sorting;

import java.util.Arrays;

public class Selectionsortswapcount {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        selectionsort(arr);
        int swaps=selectionsort(arr);
        System.out.println(swaps);
        System.out.println(Arrays.toString(arr));
    }
    static int selectionsort(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=maxindex(arr , 0, last);
            swap(arr,max,last);
            count++;
        }
        return count;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxindex(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]<arr[max]){
                max=i;
            }
        }
        return max;
    }
}
