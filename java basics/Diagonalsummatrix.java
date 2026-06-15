/*Matrix Diagonal Sum*/
import java.util.*;
public class Diagonalsummatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]numbers=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               // System.out.println(Arrays.toString(numbers[i]));
            }
            System.out.println(Arrays.toString(numbers[i]));
        }
        System.out.println(matrixsum(numbers));
    }
    public static int matrixsum(int[][]matrix){
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+matrix[i][i];
            sum=sum+matrix[i][n-1-i];
        }
        if(n%2==1){
            sum=sum-matrix[n/2][n/2];
        }
        return sum;
    }
}
