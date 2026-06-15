package Sorting;

public class Selectionsortmaxelement {
    public static void main(String[] args) {
        int []arr={4,3,2,1};
        int ans=maximumswaps(arr);
        System.out.println(ans);
    }
    static int maximumswaps(int[]arr){
        int max=0;
        int n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
        }
        return arr[max];
    }
}
