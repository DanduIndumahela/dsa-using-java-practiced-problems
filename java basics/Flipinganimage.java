/*832. Flipping an Image*/
import java.util.*;
public class Flipinganimage{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int [][]ans=flipingimage(arr);
        System.out.println("print inverted image");
        for(int row=0;row<ans.length;row++){
            System.out.println(Arrays.toString(ans[row]));
        }
    }
    static int[][] flipingimage(int [][]image){
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m/2;j++){
                int temp=image[i][j];
                image[i][j]=image[i][m-1-j];
                image[i][m-1-j]=temp;
            }
            for(int j=0;j<m;j++)
            if(image[i][j]==0){
                image[i][j]=1;
            }else{
                image[i][j]=0;
            }
        }
        return image;
    }
}
