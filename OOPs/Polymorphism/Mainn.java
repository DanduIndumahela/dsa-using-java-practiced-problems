package OOPs.Polymorphism;

public class Mainn {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Square squar = new Square();
        Triangle triangl = new Triangle();
        Shapes squaree = new Square();
        squaree.area();
        shape.area();
        circle.area();
        squar.area();
        triangl.area();
    }
}
