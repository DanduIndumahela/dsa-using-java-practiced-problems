public class Linearsearchreturntrueorfalse {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,6,8,9,99,88,66,55};
        int target=99;
        boolean ans=linearsearch(nums,target);
        System.out.println(ans);
    }
    static boolean linearsearch(int [] arr,int target){
        if(arr.length==0){
            return false;
        }
        for(int element:arr){
            if(element==target){
                return true;
            }    
        }
        return false;
    }
}
