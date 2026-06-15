package Strings;
import java.util.Arrays;

public class Stringmethod {
    public static void main(String[] args) {
        String name = "kunal kushwaha";
        char[] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));
        String namee="     kunal kushwaha";
        System.out.println(namee.strip());
        System.out.println(Arrays.toString(namee.split(" ")));
    }
}
