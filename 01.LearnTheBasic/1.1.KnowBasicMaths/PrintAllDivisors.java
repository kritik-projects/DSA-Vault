public class PrintAllDivisors {
    public static long sumOfAllDivisors(int n) {
        long ans = 0;
        long l = 1;

        // Optimized approach: O(sqrt(n))
        while (l <= n) {
            long val = n / l;

            // 'r' = maximum value of 'i' such that 'n/i' is val
            long r = n / val;

            // Using the Arithmetic Progression sum formula:
            // Sum of numbers from l to r = (Sum 1 to r) - (Sum 1 to l-1)
            long sumLtoR = (r * (r + 1) / 2) - (l * (l - 1) / 2);
            
            ans += sumLtoR * val;

            // Moving on to the next range
            l = r + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        // Divisors of 1: 1
        // Divisors of 2: 1, 2
        // Divisors of 3: 1, 3
        // Divisors of 4: 1, 2, 4
        // Total sum = 1 + (1+2) + (1+3) + (1+2+4) = 15
        System.out.println("Sum of all divisors up to " + n + ": " + sumOfAllDivisors(n));
    }
}
