public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int []arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitmin(arr, m));
    }
    static int splitmin(int[] arr,int m){
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end=end+arr[i];
        }
        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int i=0;i<arr.length;i++){
                if(sum+arr[i]>mid){
                    sum=arr[i];
                    pieces++;
                }else{
                    sum=sum+arr[i];
                }
            }
            if(pieces>m){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return end;
    }

}
