public class  LargestElement {
    public static int findLargest(int[] arr, int n) {
        // 1. Assume the first element is the largest
        int max = arr[0];

        // 2. Iterate through the rest of the array
        for (int i = 1; i < n; i++) {
            // 3. Update max if a larger element is found
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 2};
        int n = arr.length;
        
        System.out.println("Largest element is: " + findLargest(arr, n));
    }
}
