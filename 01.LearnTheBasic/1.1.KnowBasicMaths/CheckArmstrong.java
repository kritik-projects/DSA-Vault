public class CheckArmstrong {
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        
        // 1. Find the number of digits (size)
        int size = String.valueOf(n).length();
        
        // 2. Extract digits and calculate sum of powers
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            
            // Math.pow returns a double, so we cast it to int
            sum += Math.pow(digit, size);
            
            temp = temp / 10;
        }
        
        // 3. Compare sum with the original number
        return sum == original;
    }

    public static void main(String[] args) {
        int testNum = 153; // 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        System.out.println(testNum + " is Armstrong: " + isArmstrong(testNum));
        
        int testNum2 = 1634; // 1^4 + 6^4 + 3^4 + 4^4 = 1634
        System.out.println(testNum2 + " is Armstrong: " + isArmstrong(testNum2));
    }
}
