package OOPs.Generic.Comparison;

public class With {
    public static void main(String[] args) {
        Student stude1 = new Student(1, 9.00f);
        Student stude2 = new Student(1, 8.00f);

        if (stude1.compareTo(stude2) > 0) {
            System.out.println("high things");
        } else {
            System.out.println("low things");
        }
    }
}
