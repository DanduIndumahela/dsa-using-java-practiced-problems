package OOPs.Polymorphism;

public class Overloading {
    // int suum(int a, int b)
    void suum(int a, int b) {
        System.out.println(a * b);
        // return(a+b);
    }

    // int suum(int a, int b, int c, int d)
    void suum(int a, int b, int c, int d) {
        System.out.println(a * b * c * d);
        // return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading numm = new Overloading();
        numm.suum(1, 2);
        numm.suum(1, 2, 3, 4);
        // System.out.println(numm.suum(1, 2));
        // System.out.println(numm.suum(1, 2, 3, 4));
    }
}
