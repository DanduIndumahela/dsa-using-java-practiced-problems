import java.util.*;

public class Wheninput0printsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            int num=sc.nextInt();
            if(num==0){
            break;
            }
            else{
            sum=sum+num;   
            }
        }
        System.out.println(sum);
    }
    
}
