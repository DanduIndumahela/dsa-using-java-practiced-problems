/*989. Add to Array-Form of Integer*/
import java.util.*;
public class Addtoarrayform {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        System.out.println("enter n elemnets");
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        System.out.println("Enter the number to add:");
        int k = sc.nextInt();
        List<Integer> result =addtoarrayform(num,k);
        System.out.println(result);

    }
    public static List<Integer> addtoarrayform(List<Integer> num,int k){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=num.size()-1;i>=0;i--){
            int sum=num.get(i)+k;
            res.add(0, sum%10);
            k=sum/10;
        }
        while(k>0){
            res.add(0,k%10);
            k=k/10;
        }
        return res;
    }

}
