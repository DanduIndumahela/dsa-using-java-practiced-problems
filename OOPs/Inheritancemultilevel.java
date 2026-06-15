package OOPs;

public class Inheritancemultilevel extends Boxweight {
    double cost;

    Inheritancemultilevel() {
        super();
        this.cost = -1;
    }

    Inheritancemultilevel(Inheritancemultilevel other) {
        super(other);
        this.cost = other.cost;
    }

    public Inheritancemultilevel(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public Inheritancemultilevel(double side, double weight, double cost) {
        super(side, weight, cost);
        this.cost = cost;
    }

}