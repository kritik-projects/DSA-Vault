public class GCDorHCF {
    public static int calcGCD(int n, int m) {
        // Euclidean Algorithm
        while (n != 0) {
            int remainder = m % n;
            m = n;
            n = remainder;
        }
        // When n becomes 0, m contains the GCD
        return m;
    }

    public static void main(String[] args) {
        // Example: GCD of 48 and 18 is 6
        System.out.println("GCD: " + calcGCD(48, 18));
        
        // Example: GCD of 13 and 7 is 1 (Co-prime)
        System.out.println("GCD: " + calcGCD(13, 7));
    }
}
