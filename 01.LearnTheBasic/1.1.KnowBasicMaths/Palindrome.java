public class Palindrome {
    public boolean isPalindrome(int n) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (n < 0) return false;

        int original = n;
        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            
            // Check for overflow before multiplying by 10
            if (reversed > Integer.MAX_VALUE / 10) return false;
            
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(121));  // Output: true
        System.out.println(p.isPalindrome(-121)); // Output: false
    }
}
