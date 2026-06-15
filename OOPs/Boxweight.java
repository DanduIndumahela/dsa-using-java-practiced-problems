package OOPs;

public class Boxweight extends Inheritance {
    double weight;

    // Default constructor
    public Boxweight() {
        super(); // calls Inheritance()
        this.weight = -1;
    }

    // Constructor with 3 parameters
    public Boxweight(double length, double height, double width) {
        super(length, height, width);
        this.weight = -1; // default
    }

    public Boxweight(double length, double height, double width, double weight) {
        super(length, height, width); // call parent constructor
        this.weight = weight;
    }

    Boxweight(double side, double weight) {
        super(side); // call parent constructor
        this.weight = weight;
    }

    public Boxweight(Boxweight other) {
        super(other); // call parent constructor
        // this.weight = weight;
    }
}
