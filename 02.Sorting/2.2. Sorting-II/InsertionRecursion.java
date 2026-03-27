import java.util.Arrays;

public class InsertionRecursion {
    public static void insertionSort(int[] arr, int i, int n) {
        // 1. Base Case: If we've processed all elements, stop
        if (i == n) {
            return;
        }

        // 2. The "Insertion" logic:
        // Take the element at index i and move it to its correct spot on the left
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            // Swap
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }

        // 3. Recursive Call: Move to the next element
        insertionSort(arr, i + 1, n);
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        
        // Start from index 0 (though index 1 is also fine as 0 is sorted by default)
        insertionSort(arr, 0, arr.length);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
