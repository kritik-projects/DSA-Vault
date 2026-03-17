public class ValidPalindromeLeet {
    public static boolean isPalindrome(String s) {
        // Step 1: Clean the string (only lowercase alphanumeric)
        // This makes it easy to handle "A man, a plan, a canal: Panama"
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Step 2: Call recursive helper
        return check(0, clean.length() - 1, clean);
    }

    private static boolean check(int left, int right, String s) {
        // Base Case: If pointers meet or cross, all characters matched
        if (left >= right) {
            return true;
        }

        // Recursive Step: Compare characters at ends
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Move inward
        return check(left + 1, right - 1, s);
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";

        System.out.println("Test 1 is Palindrome: " + isPalindrome(test1)); // true
        System.out.println("Test 2 is Palindrome: " + isPalindrome(test2)); // false
    }
}
