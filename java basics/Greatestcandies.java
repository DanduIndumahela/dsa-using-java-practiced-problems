/*1431. Kids With the Greatest Number of Candies
So */
/*import java.util.*;
public class Greatestcandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] candies = new int[n];
        System.out.println("Enter the candies for each child:");
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        System.out.println("Enter extra candies:");
        int extraCandies = sc.nextInt();
        // Calling the function
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.println("Result: " + result);
        sc.close();
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        // Find the maximum number of candies any kid has
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        // Check if each kid can have the maximum candies with extraCandies
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        return result;
    }
}
*/
import java.util.*;
public class Greatestcandies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter extracandies");
        int extracandiess=sc.nextInt();
        boolean[] ans=candies(arr, extracandiess);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] candies(int[] candies,int extracandies){
        boolean [] result=new boolean[candies.length];
        int maxcandies=0;
        for(int i=0;i<candies.length;i++){
            maxcandies=Math.max(maxcandies,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            result[i]=candies[i]+extracandies>=maxcandies;
        }
        return result;
    }
}