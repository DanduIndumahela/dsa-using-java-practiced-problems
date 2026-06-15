import java.util.*;
import java.util.ArrayList;
public class Binarywatch{
    public static void main(String[] args) {
        int turnedon=3;
        System.out.println(readBinaryWatch(turnedon));
    }
    static List<String> readBinaryWatch(int turnedOn) {
        List<String> result=new ArrayList<>();
        int hours=5;
        for(int i=0;i<6;i++){
            if(Integer.bitCount(i)==turnedOn){
                result.add(hours + ":" + String.format("%02d",i));
            }
        }
        return result;
    }
}