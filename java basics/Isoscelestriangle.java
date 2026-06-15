public class Isoscelestriangle {
    public static void main(String[] args) {
        double a = 9.0;  // Example equal side length
        double b = 8.0;  // Example base length
        
        // Call the methods to calculate height and area
        double height = calculateHeight(a, b);
        double area = calculateArea(b, height);
        
        // Output the result
        System.out.println("The area of the isosceles triangle is: " + area);
    }

    // Method to calculate the height of the isosceles triangle
    static double calculateHeight(double a, double b) {
        return Math.sqrt(a * a - (b / 2) * (b / 2));  // Using Pythagorean theorem
    }
 // Method to calculate the area of the isosceles triangle
    static double calculateArea(double b, double height) {
        return 0.5 * b * height;  // Area formula: (1/2) * base * height
    }
}/*
public class Isoscelestriangle {
    public static void main(String[] args) {
        double a = 9.0;  // Example equal side length
        double b = 8.0;  // Example base length
        
        // Call the methods to calculate and print height and area
        calculateHeight(a, b);  // This will calculate and print the height
        calculateArea(b, a);    // This will calculate and print the area
    }

    // Method to calculate and print the height of the isosceles triangle
    static void calculateHeight(double a, double b) {
        double height = Math.sqrt(a * a - (b / 2) * (b / 2));  // Using Pythagorean theorem
        System.out.println("The height of the isosceles triangle is: " + height);
    }

    // Method to calculate and print the area of the isosceles triangle
    static void calculateArea(double b, double a) {
        double height = Math.sqrt(a * a - (b / 2) * (b / 2));  // Calculate height inside the area method
        double area = 0.5 * b * height;  // Area formula: (1/2) * base * height
        System.out.println("The area of the isosceles triangle is: " + area);
    }
}
*/