public class SumOfFirstNNumbers {
    // Recursive function to find sum of first N numbers
    public static long sumFirstN(long n) {
        // 1. Base Case: The sum of 0 is 0
        if (n == 0) {
            return 0;
        }

        // 2. Recursive Step: n + sum of (n-1)
        return n + sumFirstN(n - 1);
    }

    public static void main(String[] args) {
        long n = 10;
        System.out.println("Sum of first " + n + " numbers is: " + sumFirstN(n));
    }
}
