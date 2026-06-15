import java.util.*;
public class Factorofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<=0){
            System.out.println("enter positive number");
        }
        else{

            for(int i=1;i<=number;i++){
                if(number%i==0){
                    System.out.println(i);
                }
            }
        }
    }
    
}
/*
//import java.util.*;

public class Factorofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        // Keep asking for input until the number is positive
        while (true) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();  // Read the number from user input
            
            // Check if the number is positive
            if (number > 0) {
                break; // Exit the loop if the number is positive
            } else {
                System.out.println("Please enter a positive number.");
            }
        }

        // Find and print factors of the positive number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }
    }
}
*/