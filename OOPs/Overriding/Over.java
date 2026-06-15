package OOPs.Overriding;

public class Over {
    public static void main(String[] args) {
        Triangles triangle = new Triangles();
        triangle.area();
        Circles circle = new Circles();
        circle.area();
        Overriding overriden = new Circles();
        overriden.area();
        Overriding overridens = new Triangles();
        overridens.area();
    }
}
