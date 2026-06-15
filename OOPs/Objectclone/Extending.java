package OOPs.Objectclone;

public class Extending implements Cloneable {
    int agee;
    String name;
    int[] arrr;

    public Extending(int agee, String name) {
        this.agee = agee;
        this.name = name;
        this.arrr = new int[] { 1, 2, 3, 4 };
    }

    public Extending(Extending other) {
        this.agee = other.agee;
        this.name = other.name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
