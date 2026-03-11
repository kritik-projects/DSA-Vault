 import java.util.*;
public class ReverseBitLeet {
    // 1. Your logic must be inside the class
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversed;
    }

    // 2. Your main method to run the code
    public static void main(String[] args) {
        ReverseBitLeet sol = new ReverseBitLeet();
        System.out.println(sol.reverse(123));
    }
}


