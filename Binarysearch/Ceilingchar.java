import java.util.*;
public class Ceilingchar {
    public static void main(String[] arr){
        char [] letters ={'c','h','j','o'};
        char target='p';
        char ans=ceilingchar(letters,target);
        System.out.println(ans);
    }
    static char ceilingchar(char[] letters ,char target){
        int start=0;
        int end=letters.length-1;
        while(start<=end){
        int mid=start+(end-start)/2;
        if(target<letters[mid]){
            end=mid-1;
        }
        else {
            start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
    
}
