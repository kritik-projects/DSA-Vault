import java.util.Arrays;

public class BubbleRecursive {
    public static void bubbleSort(int[] arr, int n) {
        // 1. Base Case: If array size is 1, it's already sorted
        if (n == 1) {
            return;
        }

        boolean swapped = false;
        // 2. One "Pass" of Bubble Sort
        // This pushes the largest element of the current range to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }

        // 3. Optimization: If no elements were swapped, array is sorted
        if (!swapped) {
            return;
        }

        // 4. Recursive Call for the remaining n-1 elements
        bubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(arr, arr.length);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
