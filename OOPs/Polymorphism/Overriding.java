package OOPs.Polymorphism;

public class Overriding {
    int nuum;

    public Overriding(int nuum) {
        this.nuum = nuum;
    }

    public String toString() {
        return "Overriding{" +
                "nuum" + nuum + '}';
    }

    public static void main(String[] args) {
        Overriding objj = new Overriding(8);
        // System.out.println(objj.nuum());
    }
}
