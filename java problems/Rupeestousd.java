import java.util.*;
public class Rupeestousd {
    public static void main(String[] args) {
        double conversionrate=80.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter amount in rupees");
        int amountinrupess=sc.nextInt();
        double amountinusd=amountinrupess/conversionrate;
        System.out.println("result"+amountinusd);
    }
    
}
