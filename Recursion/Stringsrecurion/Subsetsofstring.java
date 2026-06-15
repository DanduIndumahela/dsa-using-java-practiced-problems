package Recursion.Stringsrecurion;

public class Subsetsofstring {
    public static void main(String[] args) {
        subsets("", "ab");
    }

    static void subsets(String p, String ip) {
        if (ip.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = ip.charAt(0);
        subsets(p + ch, ip.substring(1));
        subsets(p, ip.substring(1));
    }
}
