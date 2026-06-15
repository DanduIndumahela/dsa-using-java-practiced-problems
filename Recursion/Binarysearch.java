package Recursion;

public class Binarysearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,66,88,98,96,99};
        int target=99;
        int anss=binary(arr,target,0,arr.length-1);
        System.out.println(anss);
    }
    static int binary(int [] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return binary(arr,target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);
    }
}
