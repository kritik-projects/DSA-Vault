public class RemoveDuplicatesLeet {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // 1. 'i' is the pointer for the last unique element
        int i = 0;

        // 2. 'j' is the moving pointer that scans the array
        for (int j = 1; j < nums.length; j++) {
            // 3. If we find a new unique element
            if (nums[j] != nums[i]) {
                // Move the unique pointer forward and update its value
                i++;
                nums[i] = nums[j];
            }
        }

        // 4. The number of unique elements is (i + 1)
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};
        
        int k = removeDuplicates(nums);
        
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified Array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
