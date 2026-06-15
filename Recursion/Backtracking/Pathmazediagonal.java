package Recursion.Backtracking;

import java.util.ArrayList;

public class Pathmazediagonal {
    public static void main(String[] args) {
        System.out.println(path("", 9, 9));
    }

    static ArrayList<String> path(String p, int ro, int co) {
        if (ro == 1 || co == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> listt = new ArrayList<>();
        if (ro > 1 && co > 1) {
            listt.addAll(path(p + 'L', ro - 1, co - 1));
        }
        if (ro > 1) {
            listt.addAll(path(p + 'D', ro - 1, co));
        }
        if (co > 1) {
            listt.addAll(path(p + 'R', ro, co - 1));
        }
        return listt;
    }
}