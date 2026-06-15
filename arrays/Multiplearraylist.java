import java.util.*;
public class Multiplearraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <ArrayList<Integer>> list=new ArrayList<> ();
        //intilization
        for(int i=0;i<4;i++){
            list.add(new ArrayList<>());

        }
        //add elements
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.print(list);
    }
    
}
