// package 01.LearnTheBasic.1.1KnowBasicMaths;

public class CountDigits {
    public static int countDigits(int n) {
        // Convert the number to a string to iterate through digits
        String digits = String.valueOf(n);
        int count = 0;

        for (int i = 0; i < digits.length(); i++) {
            // Get the numeric value of the character at index i
            int digit = Character.getNumericValue(digits.charAt(i));

            // Skip if the digit is 0 to avoid DivisionByZero error
            if (digit == 0) {
                continue;
            }

            // Check if the original number is divisible by the digit
            if (n % digit == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test case
        System.out.println(countDigits(121)); // Output: 2
    }
}
