import java.util.*;
public class Arraysuslistusingscanner {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=9;
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        //for(int i=0;i<n;i++){
          //  System.out.println(list.get(i));
        //}
        System.out.println(list);
    }
    
}
