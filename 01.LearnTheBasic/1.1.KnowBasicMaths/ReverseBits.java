// package 01.LearnTheBasic.1.1.KnowBasicMaths;

public class ReverseBits {
    public static long reverseBits(long n) {
        long res = 0;
        // We loop 32 times because the problem specifies a 32-bit integer
        for (int i = 0; i < 32; i++) {
            // 1. Shift result to the left to make room for the next bit
            res = res << 1;
            
            // 2. If the last bit of n is 1, add 1 to our result
            if ((n & 1) == 1) {
                res = res + 1;
            }
            
            // 3. Shift n to the right to process the next bit
            n = n >> 1;
        }
        return res;
    }

    public static void main(String[] args) {
        // Test with a number, e.g., 12
        // Binary of 12 (32-bit) is 00000000000000000000000000001100
        // Reversed: 00110000000000000000000000000000
        System.out.println(reverseBits(12));
    }
    
}
