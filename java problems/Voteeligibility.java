import java.util.*;
public class Voteeligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int agee=sc.nextInt();
        if(agee>=18){
            System.out.println("person can vote"+agee);
        }
        else{
            System.out.println("person is not eligible to vote"+agee);
        }
    }
}
