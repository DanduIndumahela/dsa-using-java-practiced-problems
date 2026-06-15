package arrayfunctions;

public class Arraysmaxrange {
    public static void main(String[] args){

        int arr[]={8,9,6,9};
        System.out.println(maxrange(arr, 1 ,2));
        }
        static int maxrange(int arr[],int start,int end){
            int maxval=arr[start];
            for(int i=start;i<=end;i++){
                    if(arr[i]>maxval){
                        maxval=arr[i];
                }
            }
            return maxval;
    }

}

    
