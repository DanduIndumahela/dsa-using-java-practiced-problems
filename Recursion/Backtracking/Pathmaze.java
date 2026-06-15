package Recursion.Backtracking;

/*public class Pathmaze {
    public static void main(String[] args) {
        path("", 9, 9);
    }

    static void path(String p, int ro, int co) {
        if (ro == 1 || co == 1) {
            System.out.println(p);
            return;
        }
        if (ro > 1) {
            path(p + 'D', ro - 1, co);
        }
        if (co > 1) {
            path(p + 'R', ro, co - 1);
        }
    }
}*/
import java.util.List;
import java.util.ArrayList;

public class Pathmaze {
    public static void main(String[] args) {
        // path("", 9, 9);
        System.out.println(path("", 8, 8));
    }

    static ArrayList<String> path(String p, int ro, int co) {
        if (ro == 1 || co == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> listt = new ArrayList<>();
        if (ro > 1) {
            listt.addAll(path(p + 'D', ro - 1, co));
        }
        if (co > 1) {
            listt.addAll(path(p + 'R', ro, co - 1));
        }
        return listt;
    }
}
