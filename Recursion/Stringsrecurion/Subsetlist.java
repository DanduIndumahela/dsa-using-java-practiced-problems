package Recursion.Stringsrecurion;

import java.util.ArrayList;

/*public class Subsetlist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        subset("", "ab", list);
        System.out.println(list);
    }

    static void subset(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subset(ch + p, up.substring(1), list);
        subset(p, up.substring(1), list);
    }
}*/
public class Subsetlist {
    public static void main(String[] args) {
        System.out.println(subset("", "ab"));
    }

    static ArrayList subset(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset(p + ch, up.substring(1));
        ArrayList<String> right = subset(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
