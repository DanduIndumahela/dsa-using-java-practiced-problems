package Recursion.Stringsrecurion;

/*public class Amazondice {
    public static void main(String[] args) {
        dice("", 6);
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

}
import java.util.ArrayList;

public class Amazondice {
    public static void main(String[] args) {
        System.out.println(dice("", 6));
    }

    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> anss = new ArrayList<>();
            anss.add(p);
            return anss;
        }
        ArrayList<String> anss = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            anss.addAll(dice(p + i, target - i));
        }
        return anss;
    }
}
public class Amazondice {
    public static void main(String[] args) {
        dice("", 6, 8);
    }

    static void dice(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= 6 && i <= target; i++) {
            dice(p + i, target - i, face);
        }
    }
}*/
public class Amazondice {
    public static void main(String[] args) {
        int anss = dice("", 6);
        System.out.println(anss);
    }

    static int dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + dice(p + i, target - i);
        }
        return count;
    }
}