package Recursion.Stringsrecurion;

/*public class Permutation {
    public static void main(String[] args) {
        permutation("", "abcd");
    }

    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        ArrayList<String> anss = permutation("", "abcd");
        System.out.println(anss);
    }

    static ArrayList<String> permutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> anss = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            anss.addAll(permutation(f + ch + s, up.substring(1)));
        }
        return anss;
    }
}*/
public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationcount("", "abcd"));
    }

    static int permutationcount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationcount(f + ch + s, up.substring(1));
        }
        return count;
    }
}