import java.util.*;

public class Jumpgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int farthest = 0;
        
        for (int i = 0; i < n; i++) {
            if (i > farthest) {  // If we reach an index that is not accessible
                System.out.println("false");
                sc.close();
                return;
            }

            farthest = Math.max(farthest, i + nums[i]); // Update the farthest reachable index
            
            if (farthest >= n - 1) {  // If we can reach the last index
                System.out.println("true");
                sc.close();
                return;
            }
        }
        
        System.out.println("false"); // If loop completes, return false
        sc.close();
    }
}
