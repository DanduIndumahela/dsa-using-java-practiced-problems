package Recursion.Stringsrecurion;

/*public class Stringskip {
    public static void main(String[] args) {
        skip("", "baccadh");
    }

    static void skip(String answer, String original) {
        if (original.isEmpty()) {
            System.out.println(answer);
            return;
        }
        char ch = original.charAt(0);
        if (ch == 'a') {
            skip(answer, original.substring(1));
        } else {
            skip(answer + ch, original.substring(1));
        }
    }
}
public class Stringskip {
    public static void main(String[] args) {
        System.out.println(skip("bcaacb"));
    }

    static String skip(String original) {
        if (original.isEmpty()) {
            return " ";
        }
        char ch = original.charAt(0);
        if (ch == 'a') {
            return skip(original.substring(1));
        } else {
            return ch + skip(original.substring(1));
        }
    }
}*/

public class Stringskip {
    public static void main(String[] args) {
        System.out.println(skip("bcaacb", new StringBuilder()).toString()); // Output: "caac"
    }

    static StringBuilder skip(String original, StringBuilder anss) {
        if (original.isEmpty()) {
            return anss;
        }
        char ch = original.charAt(0);
        if (ch != 'b') {
            anss.append(ch);
        }
        return skip(original.substring(1), anss);
    }
}
