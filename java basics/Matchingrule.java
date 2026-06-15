/*1773. Count Items Matching a Rule*/
import java.util.*;
public class Matchingrule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Take input for the number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // 2️⃣ Create ArrayList to store items
        List<List<String>> items = new ArrayList<>();

        // 3️⃣ Take input for each item (type, color, name)
        System.out.println("Enter each item as: type color name");
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();          // Take input as a string
            String[] parts = line.split(" ");    // Split it into type, color, and name
            items.add(Arrays.asList(parts[0], parts[1], parts[2])); // Store in ArrayList
        }

        // 4️⃣ Take ruleKey and ruleValue input
        System.out.print("Enter ruleKey (type/color/name): ");
        String ruleKey = sc.nextLine();

        System.out.print("Enter ruleValue: ");
        String ruleValue = sc.nextLine();

        // 5️⃣ Count matching items
        int count = countMatches(items, ruleKey, ruleValue);
        System.out.println("Matching items count: " + count);

        sc.close();
    }

    // 💡 Method to count matching items
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;

        // 6️⃣ Map ruleKey to the correct index
        if (ruleKey.equals("color")) {
            index = 1;  // Color is at index 1
        } else if (ruleKey.equals("name")) {
            index = 2;  // Name is at index 2
        }
        // (If ruleKey is "type", index remains 0
        int count = 0;

        // Loop through items and count matches
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;  // Increase count if it matches the rule
            }
        }

        return count;  // Return the total count
    }
}