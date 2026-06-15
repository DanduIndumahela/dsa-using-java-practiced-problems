package Recursion.Stringsrecurion;

/*public class Toskipentirestring {
    public static void main(String[] args) {
        System.out.println(skip("bcdappledf"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skip(up.substring(5));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}*/
public class Toskipentirestring {
    public static void main(String[] args) {
        System.out.println(skip("bcdappldf"));
    }

    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skip(up.substring(3));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
