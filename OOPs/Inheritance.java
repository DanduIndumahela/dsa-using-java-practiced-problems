package OOPs;

public class Inheritance {
    double length;
    double height;
    double width;

    Inheritance() {
        this.length = -1;
        this.height = -1;
        this.width = -1;
    }

    Inheritance(double side) {
        this.length = side;
        this.height = side;
        this.width = side;
    }

    Inheritance(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Inheritance(Inheritance old) {
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void display() {
        System.out.println("running the box");
    }
}
