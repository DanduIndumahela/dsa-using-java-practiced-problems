package arrayfunctions;
public class Arraysedgecases {
    public static void main(String[] args){

        int arr[]={};
        System.out.println(maxrange(arr ,1,2));
        }
        static int maxrange(int arr[],int start,int end){
            if(end>start){
                return-1;
            }
            if(arr==null){
                return -1;
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

    
