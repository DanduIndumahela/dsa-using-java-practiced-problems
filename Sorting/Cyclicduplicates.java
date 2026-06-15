package Sorting;

public class Cyclicduplicates {
    public static void main(String[] args) {
        int []arr={4,3,2,1,2};
        System.out.println(cyclicsort(arr));
    }
    static int cyclicsort(int[]arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correctindex=arr[i]-1;
                if(arr[i]!=arr[correctindex]){
                    int temp=arr[i];
                    arr[i]=arr[correctindex];
                    arr[correctindex]=temp;
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
