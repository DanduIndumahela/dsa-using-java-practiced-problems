public class Maxwealth {
    public static void main(String args[]){
        int [][]arr={
            {1,2,3,4},
            {2,3,8,9},
            {1,2,8,8},
            {3,4,9,9},
        };
        System.out.println(maxWealth(arr));

    }
    static int maxWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum=sum+accounts[person][account];

            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
    
}
