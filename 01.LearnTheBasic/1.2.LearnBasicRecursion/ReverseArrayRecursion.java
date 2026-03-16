import java.util.Arrays;

public class ReverseArrayRecursion {
    public static void reverse(int[] nums, int left, int right) {
        // 1. Base Case: If pointers meet or cross, we are done
        if (left >= right) {
            return;
        }

        // 2. Swap the elements at left and right
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        // 3. Recursive Call: Move pointers inward
        reverse(nums, left + 1, right - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Initial call: left index 0, right index arr.length - 1
        reverse(arr, 0, arr.length - 1);
        
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
