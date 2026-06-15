package arrayfunctions;

public class Arraysedcasesmethond0 {
    public static void main(String[] args){

        int arr[]={};
        System.out.println(maxrange(arr ,1,2));
        }
        static int maxrange(int arr[],int start,int end){
            if (arr.length==0){
                return-1;
            }
            int maxval=arr[start];
            for(int i=start;i<=end;i++){
                    if(arr[i]>maxval){
                        maxval=arr[i];
                }
            }
            return maxval;
    }

}