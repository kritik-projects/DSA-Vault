import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        
        // 1. Handle cases where k > n
        k = k % n;
        if (k == 0) return;

        // 2. Perform the 3-step reversal
        reverse(nums, 0, k - 1);       // Reverse first k elements
        reverse(nums, k, n - 1);       // Reverse remaining elements
        reverse(nums, 0, n - 1);       // Reverse entire array
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        rotate(arr, k);
        // Expected for left rotate by 2: [3, 4, 5, 1, 2]
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
