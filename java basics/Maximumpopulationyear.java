/*1854. Maximum Population Year*/
import java.util.*;
import java.util.Scanner;

public class Maximumpopulationyear {
    public static int maximumPopulation(int[][] logs) {
        int[] years = new int[2051]; // Array to track population changes

        // Step 1: Mark birth and death years
        for (int i = 0; i < logs.length; i++) {
            years[logs[i][0]]++;  // Increase population when born
            years[logs[i][1]]--;  // Decrease population when person dies (not included in that year)
        }

        // Step 2: Compute running population and find the earliest max year
        int maxPopulation = 0, maxYear = 1950, currentPopulation = 0;

        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += years[year];  // Running total of population

            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = year;  // Update earliest max year
            }
        }

        return maxYear;  // Return the earliest year with max population
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input for number of people
        System.out.print("Enter number of people: ");
        int n = scanner.nextInt();
        
        // Create a 2D array for logs
        int[][] logs = new int[n][2];

        // Take input for birth and death years
        System.out.println("Enter birth and death years:");
        for (int i = 0; i < n; i++) {
            logs[i][0] = scanner.nextInt();  // Birth year
            logs[i][1] = scanner.nextInt();  // Death year
        }

        // Call the function and print the result
        int result = maximumPopulation(logs);
        System.out.println("Earliest year with maximum population: " + result);

        scanner.close(); // Close the scanner
    }
}
/*import java.util.*;

class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxYear = 1950, maxPopulation = 0;

        // Iterate through each year from 1950 to 2050
        for (int year = 1950; year <= 2050; year++) {
            int population = 0;

            // Check each person's lifespan
            for (int[] log : logs) {
                if (year >= log[0] && year < log[1]) { // Alive in this year
                    population++;
                }
            }

            // Update max population and year
            if (population > maxPopulation) {
                maxPopulation = population;
                maxYear = year;
            }
        }

        return maxYear;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example Test Case 1
        int[][] logs1 = { {1950, 1961}, {1960, 1971}, {1970, 1981} };
        System.out.println("Earliest year with maximum population: " + solution.maximumPopulation(logs1));
        // Expected Output: 1960

        // Example Test Case 2
        int[][] logs2 = { {1993, 1999}, {2000, 2010} };
        System.out.println("Earliest year with maximum population: " + solution.maximumPopulation(logs2));
        // Expected Output: 1993

        // Example Test Case 3
        int[][] logs3 = { {1980, 1990}, {1975, 1985}, {1990, 2000}, {2000, 2010} };
        System.out.println("Earliest year with maximum population: " + solution.maximumPopulation(logs3));
        // Expected Output: 1975
    }
}
 */