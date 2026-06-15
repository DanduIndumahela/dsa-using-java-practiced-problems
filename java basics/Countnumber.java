public class Countnumber {
    public static void main(String[] args) {
        int []numbers={12,13,8,9};
        System.out.println(findnumbers(numbers));
        
    }
    static int findnumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigts=digits(num);
        return  numberofdigts %2 ==0;


    }
    static int digits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;

    }
    
}
