package OOPs.Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> item = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            item.add(i); // i + 0 unnecessary
        }

        // Lambda with Consumer
        Consumer<Integer> itemss = nuum -> System.out.println(nuum * 99);
        item.forEach(itemss); // Apply the Consumer

        // Lambda expressions for Operation interface
        Operation suum = (a, b) -> a + b;
        Operation muul = (a, b) -> a * b;
        // Using the lambdas
        System.out.println("Sum of 5 and 0: " + suum.operation(5, 0));
        System.out.println("Multiplication of 5 and 0: " + muul.operation(5, 0));
    }
}

// Functional interface
interface Operation {
    int operation(int a, int b);
}
