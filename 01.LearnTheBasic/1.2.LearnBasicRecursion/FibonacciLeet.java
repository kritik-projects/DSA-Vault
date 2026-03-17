public class FibonacciLeet {
    public static int fib(int n) {
        // 1. Base Case: 0 returns 0, 1 returns 1
        if (n <= 1) {
            return n;
        }

        // 2. Recursive Step: The sum of the two previous numbers
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        // Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8...
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}
