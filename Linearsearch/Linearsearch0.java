public class Linearsearch0 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,6,8,9,99,88,66,55};
        int target=99;
        int ans=linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int [] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){
            if(element==target){
                return element;
            }    
        }
        return -1;
    }
}
