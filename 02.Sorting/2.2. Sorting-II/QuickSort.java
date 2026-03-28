import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        // Base Case: If the segment has 1 or 0 elements
        if (start >= end) {
            return;
        }

        // Partition the array and get the pivot index
        int p = partition(arr, start, end);

        // Recursively sort the left and right halves
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }

    private static int partition(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;

        // 1. Count elements smaller than or equal to pivot
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }

        // 2. Place pivot in its correct sorted position
        int pivotIndex = s + count;
        int temp = arr[s];
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        // 3. Ensure elements on left are <= pivot and right are > pivot
        int i = s, j = e;
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
