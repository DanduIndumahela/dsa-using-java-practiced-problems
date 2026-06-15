public class perimeterofparallelogram {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int ans=2*(a+b);
        System.out.println(ans);
    }
    
}








/* 
//import java.util.*;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0, b = 0;
        
        // Using loops to ensure the user enters positive values for sides
        while (a <= 0) {
            System.out.println("Enter the length of side a:");
            a = sc.nextDouble();
            if (a <= 0) {
                System.out.println("Please enter a positive value for side a.");
            }
        }
        
        while (b <= 0) {
            System.out.println("Enter the length of side b:");
            b = sc.nextDouble();
            if (b <= 0) {
                System.out.println("Please enter a positive value for side b.");
            }
        }

        // Call the method to calculate the perimeter and print the result
        double perimeter = calculatePerimeter(a, b);
        System.out.println("The perimeter of the parallelogram is: " + perimeter);
    }

    // Method to calculate the perimeter of the parallelogram
    static double calculatePerimeter(double a, double b) {
        return 2 * (a + b);  // Formula: Perimeter = 2 * (a + b)
    }
}
*/