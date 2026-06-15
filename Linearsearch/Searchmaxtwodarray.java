public class Searchmaxtwodarray {
    public static void main(String args[]){
        int [][] arr={
            {1,2,3,4},
            {8,9,6,5},
            {55,99,88,66},
            {44,33,22,11},
        };
        int ans=max(arr);
        System.out.println(ans);
    }
    static int max(int [][]arr){
        //int maximum=arr[0][0];
        int maximum=Integer.MIN_VALUE;
        //for(int row=0;row<arr.length;row++){
        for(int []ints:arr){
           // for(int col=0;col<arr[row].length;col++){
            for(int intss:ints){
                //if(arr[row][col]>maximum){
                if(intss>maximum){
                   // maximum=arr[row][col];
                    maximum=intss;
                }
            }
        }
        return maximum;
    }
    
}
