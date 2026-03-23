import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        // 1. Outer loop runs n times
        for (int i = 0; i < n; i++) {
            boolean swapped = false; // Optimization flag

            // 2. Inner loop: compares adjacent elements
            // We subtract 'i' because the last 'i' elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // 3. If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr, n);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
