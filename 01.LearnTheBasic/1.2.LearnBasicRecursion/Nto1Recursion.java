import java.util.ArrayList;
import java.util.List;

public class Nto1Recursion {
    
    public static List<Integer> printNos(int x) {
        List<Integer> result = new ArrayList<>();
        generateList(x, result);
        return result;
    }

    
    private static void generateList(int i, List<Integer> l) {
        // 1. Base Case: stop when we reach 0
        if (i == 0) {
            return;
        }

        // 2. Add current number (Happens while going "down")
        l.add(i);

        // 3. Recursive Call: move to the smaller number
        generateList(i - 1, l);
    }

    public static void main(String[] args) {
        int x = 5;
        List<Integer> output = printNos(x);
        System.out.println(output); // Output: [5, 4, 3, 2, 1]
    }
}
