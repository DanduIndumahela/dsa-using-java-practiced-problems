import java.util.*;

public class Areaofrhombus {
    public static void main(String[] args) {
        System.out.println("enter diagonals of rhombus");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter diagonal1");
        double d1 = sc.nextDouble();
        System.out.println("enter diagonal2");
        double d2 = sc.nextDouble();
        rhombus(d1, d2);
        System.out.println();

    }

    static void rhombus(double d1, double d2) {
        double area = 0.5 * d1 * d2;
        System.out.println(area);
    }

}
// or//
// import java.util.*;
/*
 * public class Areaofrhombus {
 * public static void main(String[] args) {
 * System.out.println("Enter diagonals of rhombus:");
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter diagonal1: ");
 * double d1 = sc.nextDouble();
 * System.out.print("Enter diagonal2: ");
 * double d2 = sc.nextDouble();
 * 
 * // Call the rhombus method and store the result
 * double ans = rhombus(d1, d2);
 * 
 * // Print the area of the rhombus
 * System.out.println("The area of the rhombus is: " + ans);
 * }
 * 
 * // Method to calculate the area of the rhombus
 * static double rhombus(double d1, double d2) {
 * // Correct formula: Area = 0.5 * d1 * d2
 * return 0.5 * d1 * d2; // Return the calculated area
 * }
 * }//
 */