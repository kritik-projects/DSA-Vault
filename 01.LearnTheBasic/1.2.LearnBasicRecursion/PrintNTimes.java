public class PrintNTimes {
    public static void printNtimes(int n) {
        // 1. Base Case: stop when n hits 0
        if (n == 0) {
            return;
        }

        // 2. Recursive Call: This "waits" on the stack
        printNtimes(n - 1);

        // 3. Print: This happens as the recursion "unwinds"
        System.out.println("Kritik DSA Vault ");
    }

    public static void main(String[] args) {
        int n = 4;
        printNtimes(n); // Output: Kritik DSA Vault Kritik DSA Vault Kritik DSA Vault Kritik DSA Vault 
    }
}
