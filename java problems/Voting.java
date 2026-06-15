import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            System.out.println(agee(age));

    }
    static String agee(int agee){
        if(agee>=18){
            return "eligible to vote";
        }else{
            return "not eligible to vote";
        }
    }
    
}
