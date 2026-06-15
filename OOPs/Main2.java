package OOPs;

public class Main2 {
    public static void main(String[] args) {
        Inheritancemultilevel box1 = new Inheritancemultilevel();
        Inheritancemultilevel box2 = new Inheritancemultilevel(4, 3, 120);
        System.out.println(box1.height + "" + box1.length);
        System.out.println(box2.weight);
    }
}
