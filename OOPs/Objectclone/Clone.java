package OOPs.Objectclone;

import java.util.Arrays;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Extending indu = new Extending(99, "indu");
        // Showlloing indu = new Showlloing(99, "indu");
        // Extending twin = new Extending(indu);
        System.out.println(indu.agee + "" + indu.name);
        System.out.println(twin.agee + "" + twin.name);
        Extending twin = (Extending) indu.clone();
        // Showlloing twin = (Showlloing) indu.clone();
        System.out.println(twin.agee + "" + twin.name);
        System.out.println(Arrays.toString(twin.arrr));
        System.out.println(Arrays.toString(indu.arrr));
        twin.arrr[1] = 11;
        twin.arrr[2] = 12;
        System.out.println(Arrays.toString(twin.arrr));
        System.out.println(Arrays.toString(indu.arrr));
    }
}
