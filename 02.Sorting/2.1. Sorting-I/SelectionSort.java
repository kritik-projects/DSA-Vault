import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 1. Outer loop: moves the boundary of the unsorted part
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // 2. Inner loop: find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 3. Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
