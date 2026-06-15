/*1217. Minimum Cost to Move Chips to The Same Position*/
import java.util.*;
import java.util.ArrayList;
public class Costtomovesameposition {
    public static void main(String[] args) {
        int[] position ={2,2,2,3,3};
        int evencount=0; int oddcount=0;
        //List<Integer> evenchips=new ArrayList<>();
        //List<Integer> oddchips=new ArrayList<>();
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0){
                //evenchips.add(i);
                evencount++;
            }
            else{
                //oddchips.add(i);
                oddcount++;
            }
        }
        int cost=0;
        if(evencount<oddcount){
            for(int i=0;i<evencount;i++){
                //System.out.println(evenchips.get(i));
                cost++;
            }
        }
        else{
            for(int i=0;i<oddcount;i++){
               // System.out.println(oddchips.get(i));
                cost++;
            }
        }
        System.out.println(cost);
    }
}
