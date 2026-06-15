import java.util.*;
public class Switchnested {
    public static void main(String args[]){
        System.out.println("enter names");
        Scanner sc=new Scanner (System.in);
        String names=sc.next();
        int numbers=sc.nextInt();
        switch (names){
            case "hi":
                System.out.println("name is hi");
                break;
            case "hello":
                System.out.println("name is hello");
                break;
            //default:
            case "x":
                System.out.println("wrong name");
                switch(numbers){
                
                    case 9:
                        System.out.println("number is 9");
                        break;
                    case 8:
                        System.out.println("number is 8");
                        break;
                }
            
        }
    }
    
}
