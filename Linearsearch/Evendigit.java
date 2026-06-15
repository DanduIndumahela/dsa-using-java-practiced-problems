public class Evendigit {
    public static void main(String args[]){
        int[] num={12,342,2,6,8896};
        System.out.println(findnumbers(num));

    }
    static int findnumbers(int [] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int numss){
        int numberofdigits=digits(numss);
        if(numberofdigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count=0;
        if(num==0){
            return 1;
        }
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
        
    }
}
        
