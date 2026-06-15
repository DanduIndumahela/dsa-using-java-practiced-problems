import java.util.*;
public class Wheninputis0printlargestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer (0 to stop): ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("no number is entered");
        }
        int largest=num;
        while(true){
            System.out.println("enter an integer");
            num=sc.nextInt();
            if(num==0){
                break;
            }
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);


    }
    
}
