package OOPs.Objectclone;

public class Showlloing implements Cloneable {
    int agee;
    String name;
    int[] arrr;

    public Showlloing(int agee, String name) {
        this.agee = agee;
        this.name = name;
        this.arrr = new int[] { 1, 2, 3, 4 };
    }

    public Showlloing(Extending other) {
        this.agee = other.agee;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        // return super.clone();
        Showlloing twin = (Showlloing) super.clone();
        twin.arrr = new int[twin.arrr.length];
        for (int i = 0; i < twin.arrr.length; i++) {
            twin.arrr[i] = this.arrr[i];
        }
        return twin;
    }
}
