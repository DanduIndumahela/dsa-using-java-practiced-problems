//package arrays;
import java.util.*;
public class Array2D {
    public static void main(String[] args) {
        int arr[][]=new int[3][2];
        Scanner sc=new Scanner(System.in);
        for(int row=0;row<arr.length;row++){
//System.out.println(arr.length);
                for(int col=0;col<arr[row].length;col++){
                    arr[row][col]=sc.nextInt();
                    //System.out.print(arr[row][col]);

                }
        }
        for(int row=0;row<arr.length;row++){

            //System.out.println(arr.length);
            for(int col=0;col<arr[row].length;col++){
                    System.out.print(arr[row][col]+ " ");
            }
            //if we want new line
            System.out.println();
        }
    }    
}
