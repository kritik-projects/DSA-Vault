public class Prime {
    public static boolean isPrime(int n) {
        // 1. Edge cases: Numbers less than 2 are not prime
        if (n <= 1) {
            return false;
        }

        // 2. Optimization: Check divisibility up to sqrt(n)
        // We use (i * i <= n) instead of Math.sqrt(n) for better performance
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, not prime
            }
        }

        return true; // No factors found, it is prime
    }

    public static void main(String[] args) {
        int number = 37;
        if (isPrime(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
