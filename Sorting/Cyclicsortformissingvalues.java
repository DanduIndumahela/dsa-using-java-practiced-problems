package Sorting;
public class Cyclicsortformissingvalues {
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        cyclicsort(arr);
    }
    static void cyclicsort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctindex]) {
                int temp=arr[i];
                arr[i]=arr[correctindex];
                arr[correctindex]=temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
        if(arr[i]!=i+1){
            System.out.println(i+1);
            }
        }
    }
}
