package OOPs;

public class Main {
    public static void main(String[] args) {
        Inheritance answer = new Inheritance(8);
        // System.out.println(answer);
        Inheritance answer1 = new Inheritance(answer);
        System.out.println(answer1.length + "" + answer1.height + " " + answer1.width);
        System.out.println(answer.length + "" + answer.height + " " + answer.width);
    }
}
