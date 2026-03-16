import java.util.ArrayList;
import java.util.List;

public class FactorialLessThanN {
    public static List<Long> factorialNumbers(long n) {
        List<Long> result = new ArrayList<>();
        // Start recursion with 1! (which is 1)
        generateFactorials(1, 1, n, result);
        return result;
    }

    private static void generateFactorials(long currentFact, int i, long n, List<Long> l) {
        // 1. Base Case: If the factorial exceeds n, stop
        if (currentFact > n) {
            return;
        }

        // 2. Add current factorial to the list
        l.add(currentFact);

        // 3. Recursive Call: Calculate (i+1)! by multiplying currentFact * (i+1)
        // We check for overflow if n is very large, but for standard long it's okay
        generateFactorials(currentFact * (i + 1), i + 1, n, l);
    }

    public static void main(String[] args) {
        long n = 7;
        // Output should be [1, 2, 6] because 1!=1, 2!=2, 3!=6. 4!=24 (which is > 7)
        System.out.println("Factorial numbers <= " + n + ": " + factorialNumbers(n));
    }
}
