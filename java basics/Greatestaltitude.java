/*1732. Find the Highest Altitude*/
import java.util.*;

public class Greatestaltitude {
    public static void main(String[] args) {
        System.out.println("Enter size of the array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] gain = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " gain values:");
        for (int i = 0; i < n; i++) {
            gain[i] = sc.nextInt();
        }

        // Call altitude function
        int highest = altitude(gain);
        System.out.println("Highest Altitude: " + highest);

        sc.close(); // Close the scanner
    }

    static int altitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n+1]; // ✅ Fixed: +1 size to handle i+1
        altitude[0] = 0;
        int greatest = 0;

        for (int i = 0; i < n; i++) {
            altitude[i+1]= altitude[i] + gain[i]; // Safe access now
            greatest = Math.max(greatest, altitude[i + 1]);
        }

        System.out.println("Altitudes: " + Arrays.toString(altitude));
        return greatest;
    }
}

