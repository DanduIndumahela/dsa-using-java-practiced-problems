/*1431. Kids With the Greatest Number of Candies*/
/*import java.util.*;
public class Goodpairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array numbers");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(goodpairs(arr));
    }
    static int goodpairs(int [] array){
        //int n=array.length;
        //int result[]=new int[n];

        int count=0;
        for(int i=0;i<array.length-1;i++){
            //int count=0;
            if(array[i]<=array[i+1]){
                count++;
            }
           // result[i]=count;
            //System.out.println(count);
        }
        return count;
    }
}*/
import java.util.*;
public class Goodpairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //for(int i=0;i<n;i++){
        //System.out.print(arr[i]);
        //}
        System.out.println(goodpairs(arr));
    }
    static int goodpairs(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

}
